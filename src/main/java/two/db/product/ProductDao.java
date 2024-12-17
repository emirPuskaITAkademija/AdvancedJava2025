package two.db.product;

import two.db.dao.ConnectionPool;
import two.db.dao.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ProductDao implements Dao<Product> {
    @Override
    public Product create(Product product) {
        Connection connection = ConnectionPool.instance().getConnection();
        try {
            String sqlInsert = """
                    INSERT INTO products (name, quantity_in_stock, unit_price) VALUES (?, ?, ?);
                    """;
            PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setInt(2, product.getQuantityInStock());
            preparedStatement.setBigDecimal(3, product.getUnitPrice());
            preparedStatement.execute();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionPool.instance().releaseConnection(connection);
        }
        return product;
    }

    @Override
    public Product update(Product product) {
        return null;
    }

    @Override
    public Product delete(Product product) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return List.of();
    }

    @Override
    public Product findById(int id) {
        return null;
    }
}
