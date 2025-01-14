package three.pattern.decorator;

public class BosnianCoffee extends Beverage {
    public BosnianCoffee() {
        super("Bosnian Coffee");
    }

    @Override
    public double cost() {
        return 2.5;
    }
}
