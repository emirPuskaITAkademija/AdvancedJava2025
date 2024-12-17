package two.db;

import two.db.dao.Box;
import two.db.dao.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//SINGLETON
public class PoolMain {
    public static void main(String[] args) {
        ConnectionPool connectionPool = ConnectionPool.instance();
        System.out.println(connectionPool.hashCode());
        ConnectionPool connectionPool1 = ConnectionPool.instance();
        System.out.println(connectionPool1.hashCode());
        ConnectionPool connectionPool2 = ConnectionPool.instance();
        System.out.println(connectionPool2.hashCode());
        ConnectionPool connectionPool3 = ConnectionPool.instance();
        System.out.println(connectionPool3.hashCode());


        try {
            //1. Connection
            Connection connection = connectionPool.getConnection();
            //2. PreparedStatement
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM products");
            //3. ResultSet
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("product_id");
                String name = resultSet.getString("name");
                System.out.println(id + " " + name);
            }
            connectionPool.releaseConnection(connection);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        Box<Integer> box = new Box<>();
        Box<String> textBox = new Box<>();

    }
}
