package two.db.dao;

import two.db.product.Product;
import two.db.product.ProductDao;

import java.math.BigDecimal;

public class DaoMain {
    public static void main(String[] args) {
        //Tranzijentan -> Perzistentno stanje
        Product product = new Product();
        product.setName("Lenovo Yoga");
        //4,2  _ _ . _ _
        BigDecimal unitPrice = BigDecimal.valueOf(99.99);
        product.setUnitPrice(unitPrice);
        product.setQuantityInStock(1);
        System.out.println(product.getProductId());
        ProductDao productDao = new ProductDao();
        product = productDao.create(product);
        System.out.println(product.getProductId());
    }
}
