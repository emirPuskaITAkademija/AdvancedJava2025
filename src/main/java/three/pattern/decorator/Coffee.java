package three.pattern.decorator;

public class Coffee extends Beverage{
    public Coffee() {
        super("Espresso Coffee");
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
