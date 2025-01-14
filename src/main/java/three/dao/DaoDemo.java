package three.dao;

import two.db.dao.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoDemo {
    public static void main(String[] args) {
        //1. Povežemo se s bazom: Connection
        //2. Preko connection -> Statement, PreparedStatement
        //3. Obrađujemo rezultate statement -> ResultSet
        Connection connection = ConnectionPool.instance().getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM products");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }finally {
            ConnectionPool.instance().releaseConnection(connection);
        }
    }
}
