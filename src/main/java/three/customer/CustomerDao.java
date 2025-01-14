package three.customer;

import two.db.dao.ConnectionPool;
import two.db.dao.Dao;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
// CRUD operacije

/**
 * Create -> kreiraj
 * Retreieve -> dohvati
 * Update -> ažuriraj
 * Delete -> izbriši
 */
public class CustomerDao implements Dao<Customer> {
    @Override
    public Customer create(Customer customer) {
        return null;
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public Customer delete(Customer customer) {
        return null;
    }

    @Override
    public List<Customer> findAll() {
        //1. Connection
        Connection connection = ConnectionPool.instance().getConnection();
        //2. Statement
        try (PreparedStatement statement = connection.prepareStatement("select * from customers")) {
            //3. ResultSet
            ResultSet resultSet = statement.executeQuery();
            List<Customer> customers = new ArrayList<>();
            while (resultSet.next()) {
                Customer customer = new Customer();
                customer.setCustomerId(resultSet.getInt("customer_id"));
                customer.setFirstName(resultSet.getString("first_name"));
                customer.setLastName(resultSet.getString("last_name"));
                Date birthDate = resultSet.getDate("birth_date");
                LocalDate localBirthDate = birthDate.toLocalDate();
                customer.setBirthDate(localBirthDate);
                customer.setPhone(resultSet.getString("phone"));
                customer.setAddress(resultSet.getString("address"));
                customer.setCity(resultSet.getString("city"));
                customer.setState(resultSet.getString("state"));
                customer.setPoints(resultSet.getInt("points"));
                customers.add(customer);
            }
            return customers;

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionPool.instance().releaseConnection(connection);
        }
        return List.of();
    }

    @Override
    public Customer findById(int id) {
        return null;
    }
}
