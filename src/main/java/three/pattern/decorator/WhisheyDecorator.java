package three.pattern.decorator;

public class WhisheyDecorator extends Beverage {

    private Beverage beverage;

    public WhisheyDecorator(Beverage beverage) {
        super(beverage.getName() + " s Whishey");
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 5.0;
    }
}
