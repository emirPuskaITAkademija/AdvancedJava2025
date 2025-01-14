package three.pattern.decorator;

public class Tee extends Beverage {
    public Tee() {
        super("Čaj");
    }

    @Override
    public double cost() {
        return 3.0;
    }
}
