package three.pattern.strategy;

import java.math.BigDecimal;

public class FridayDiscounter implements Discounter {

    @Override
    public BigDecimal applyDiscount(BigDecimal fullAmount) {
        return fullAmount.multiply(new BigDecimal("0.4"));
    }
}
