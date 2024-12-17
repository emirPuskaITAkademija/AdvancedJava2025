package two.db.product;

import java.math.BigDecimal;

/**
 * Java klasa koja će predstavljati tabelu store.products
 * <p>
 *     BAZA: store
 *     TABELA: products
 * </p>
 */
public class Product {
    private Integer productId;
    private String name;
    private Integer quantityInStock;
    private BigDecimal unitPrice;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
}
