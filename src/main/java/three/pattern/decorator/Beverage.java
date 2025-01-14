package three.pattern.decorator;

/**
 * Razlika: klasa vs apstraktna klasa
 *
 * <li>polja</li>
 *    static and instance
 * <li>funkcije</li>
 *    static and instance
 * <li>konstruktor</li>
 * instance
 */
public abstract class Beverage {
    public static int counter = 0;

    private String name;
    private String description = "Unknown Beverage";

    public Beverage(String name) {
        this.name = name;
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();
}
