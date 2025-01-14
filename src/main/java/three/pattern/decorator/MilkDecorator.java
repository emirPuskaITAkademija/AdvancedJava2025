package three.pattern.decorator;

//Milk is beverage
//Decorator
public class MilkDecorator extends Beverage {

    //Da li MilkDecorator has a beverage
    //Depend upon abstraction not upon concrete implementation
    private Beverage beverage;

    public MilkDecorator(Beverage beverage) {
        super(beverage.getName() + " s mlijekom");
        this.beverage = beverage;
    }


    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}
