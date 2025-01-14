package three.pattern.strategy;

import java.math.BigDecimal;

/**
 * Strategy Pattern
 */
public class DiscounterExecutor {

    private Discounter discounter;

    public DiscounterExecutor(Discounter discounter) {
        this.discounter = discounter;
    }

    public void setDiscounter(Discounter discounter) {
        this.discounter = discounter;
    }

    public BigDecimal executeDiscountCalc(BigDecimal fullAmount){
        return discounter.applyDiscount(fullAmount);
    }
}
