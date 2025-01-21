package four.dao;

import three.customer.Customer;
import two.db.dao.ConnectionPool;
import two.db.dao.Dao;

import java.sql.*;
import java.util.List;

/**
 * SQL statements: INSERT
 * Java method: param Customer customer(tranzijentno) ->
 */
public class CustomerDao implements Dao<Customer> {
    /**
     * SQL INSERT with create method.
     * <p>
     * Customer customer -> param method => iz tranzijentnog u perzistentno stanje
     * </p>
     *
     * @param customer
     * @return createdCustomer
     */
    @Override
    public Customer create(Customer customer) {
        //1. Connection
        //2. PreparedStatement
        //3. ResultSet
        String sqlInsertState = """
                INSERT INTO 
                customers
                (first_name, last_name, birth_date, phone, address, city, state, points) 
                VALUES 
                (?, ?, ?, ?, ?, ?, ?, ?);
                """;
        Connection connection = ConnectionPool.instance().getConnection();
        try (
                PreparedStatement preparedStatement = connection.prepareStatement(sqlInsertState);
        ) {
            preparedStatement.setString(1, customer.getFirstName());
            preparedStatement.setString(2, customer.getLastName());
            preparedStatement.setDate(3, customer.getBirthDateAsSqlDate());
            preparedStatement.setString(4, customer.getPhone());
            preparedStatement.setString(5, customer.getAddress());
            preparedStatement.setString(6, customer.getCity());
            preparedStatement.setString(7, customer.getState());
            preparedStatement.setInt(8, customer.getPoints());
            int result = preparedStatement.executeUpdate();
            System.out.println("Insertovano " + result + " red/a/ova");
        } catch (SQLException exception) {
            System.err.println(exception.getMessage());
        } finally {
            ConnectionPool.instance().releaseConnection(connection);
        }

        return null;
    }

    @Override
    public List<Customer> findAll() {
        return List.of();
    }

    @Override
    public Customer findById(int id) {
        Customer customer = new Customer();
        //1. Connection
        Connection connection = ConnectionPool.instance().getConnection();
        //2. PreparedStatement
        String sqlSelectByIdStatement = """
                SELECT *
                FROM customers 
                WHERE customer_id = ?;
                """;
        try (PreparedStatement preparedStatement = connection.prepareStatement(sqlSelectByIdStatement)) {
            preparedStatement.setInt(1, id);
            //3. Obradimo rezultat odnoson izvršimo statement
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                customer.setCustomerId(resultSet.getInt("customer_id"));
                customer.setFirstName(resultSet.getString("first_name"));
                customer.setLastName(resultSet.getString("last_name"));
                Date birthDateSql = resultSet.getDate("birth_date");
                customer.setBirthDate(birthDateSql != null ? birthDateSql.toLocalDate() : null);
                customer.setAddress(resultSet.getString("address"));
                customer.setPhone(resultSet.getString("phone"));
                customer.setCity(resultSet.getString("city"));
                customer.setState(resultSet.getString("state"));
                customer.setPoints(resultSet.getInt("points"));
            }
        } catch (SQLException exception) {
            System.err.println(exception.getMessage());
        } finally {
            ConnectionPool.instance().releaseConnection(connection);
        }
        return customer;
    }

    @Override
    public Customer update(Customer customer) {
        //1. Connection
        Connection connection = ConnectionPool.instance().getConnection();
        //2. Prepared Statement
        String sqlUpdateById = """
                UPDATE customers
                SET 
                    first_name=?, 
                    last_name=?, 
                    birth_date=?, 
                    phone=?, 
                    address=?, 
                    city=?, 
                    state=?, 
                    points=?
                WHERE customer_id=?;
                """;
        try (PreparedStatement preparedStatement = connection.prepareStatement(sqlUpdateById)) {
            preparedStatement.setString(1, customer.getFirstName());
            preparedStatement.setString(2, customer.getLastName());
            preparedStatement.setDate(3, customer.getBirthDateAsSqlDate());
            preparedStatement.setString(4, customer.getPhone());
            preparedStatement.setString(5, customer.getAddress());
            preparedStatement.setString(6, customer.getCity());
            preparedStatement.setString(7, customer.getState());
            preparedStatement.setInt(8, customer.getPoints());
            preparedStatement.setInt(9, customer.getCustomerId());
            //3. Execute and process Result
            int result = preparedStatement.executeUpdate();
            System.out.println("Updatevano " + result + " red/a/ova");
        } catch (SQLException exception) {
            System.err.println(exception.getMessage());
        } finally {
            ConnectionPool.instance().releaseConnection(connection);
        }
        return customer;
    }

    @Override
    public Customer delete(Customer customer) {
        int id = customer.getCustomerId();
        //Nikada niej dobro za trgovca da izgubi mušterije
        String sqlDeleteByIdStatement = """
                DELETE FROM customers
                WHERE customer_id=?;
                """;
        //Preporuka: SOFT DELETE..umjesto DELETE -> UPDATE SET active=false WHERE customer_id=?
        //1. Connection
        Connection connection = ConnectionPool.instance().getConnection();
        //2. Prepared Statement
        try(PreparedStatement preparedStatement = connection.prepareStatement(sqlDeleteByIdStatement)){
            preparedStatement.setInt(1, id);
            //3. Obraditi rezultate
            int result = preparedStatement.executeUpdate();
            System.out.println("Deletvano " + result + " red/a/ova");
        }catch (SQLException exception) {
            System.err.println(exception.getMessage());
        }finally {
            ConnectionPool.instance().releaseConnection(connection);
        }
        return null;
    }
}
