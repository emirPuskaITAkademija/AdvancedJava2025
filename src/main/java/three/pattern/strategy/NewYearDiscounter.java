package three.pattern.strategy;

import java.math.BigDecimal;

public class NewYearDiscounter implements Discounter {
    @Override
    public BigDecimal applyDiscount(BigDecimal fullAmount) {
        BigDecimal multiplikator = BigDecimal.valueOf(0.7);
        BigDecimal discountedAmount =  fullAmount.multiply(multiplikator);
        return discountedAmount;
    }
}
