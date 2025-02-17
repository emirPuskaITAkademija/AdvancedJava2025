package six.reflection;

import java.io.Serializable;

/**
 * <li>1. Refleksija </li>
 * <li>2 Serijalizacija/Deserijalzacija</li>
 * <li>3. clone</li>
 * <li>4. multi-thread</li>
 */
public class Singleton implements Serializable, Cloneable {
    private Singleton() {
        System.out.println("Singleton Constructor se poziva samo jednom...");
    }

    private static Singleton instance = null;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
