package two.db;

import java.sql.*;

public class Main {
    public static void main(String[] args) {


        /*
        1. URL, username, password
        URL: jdbc:mysql://localhost:3308/store
        username: root
        password: root
         */
        String url = "jdbc:mysql://localhost:3308/store";
        String user = "root";
        String password = "root";
        //try-with-resource
        try (Connection connection = DriverManager.getConnection(url, user, password);) {
            /**
             * 2. Statement
             */
            String sql = "SELECT * FROM products";
            PreparedStatement statement = connection.prepareStatement(sql);
            /**
             * 3. Izvršiti statement
             */
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                //jedan način da izvučete podatak iz REDA je ako znate naziv kolone
                String name = resultSet.getString("name");
                //drugi način da izvučete podatak iz REDA je ako znate redni broj kolone
                //NAPOMENA: indeksi počinju ne od NULE nego od JEDINICE
                Integer quantity = resultSet.getInt(3);
                System.out.println(name + " = " + quantity);
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
