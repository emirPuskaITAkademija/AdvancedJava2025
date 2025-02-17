package six.reflection;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SingletonDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException, CloneNotSupportedException {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2.hashCode());
        Singleton singleton3 = Singleton.getInstance();
        System.out.println(singleton3.hashCode());

        Class<Singleton> clazz = Singleton.class;
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method.getName());
        }
        for (Constructor constructor : clazz.getDeclaredConstructors()) {
            System.out.println(constructor.getName());
        }
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println(field.getName());
        }

        Constructor<Singleton> singletonConstructor = clazz.getDeclaredConstructor();
        singletonConstructor.setAccessible(true);
        Singleton anotherSingleton = singletonConstructor.newInstance();
        System.out.println(anotherSingleton.hashCode());

        ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        ous.writeObject(singleton);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton.ser"));
        Singleton anotherDesSingleton = (Singleton) ois.readObject();
        System.out.println(anotherDesSingleton.hashCode());

        Singleton anotherClonedSingleton = (Singleton) singleton.clone();
        System.out.println(anotherClonedSingleton.hashCode());
    }
}
