package seven.structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrraysDemo {
    public static void main(String[] args) {
        //java.util.ArrayList
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Mary");
        names.add("Jack");
        names.add("Smith");
        names.add("Brown");
        names.remove("John");
        names.remove("Jane");
        for(String name : names) {
            System.out.println(name);
        }
        System.out.println();
        System.out.println("---------------------------------");
        //java.util.ArrayList, Arrays.ArrayList
        List<String> names2 = Arrays.asList("John", "Jane", "Bob", "Mary", "Jack", "Smith", "Brown");
        //Ovaj blok koda će jednostavno dovesti do izuzetka ili errora ili exception
        // UnsupportedOperationException() jer Arrays.ArrayList nije implementirala remove metodu
        //nego je naslijedila blok koda metode koja baca ovaj ERROR i prekida normalan tok izvršavanja
        //našeg program i zato se to zove exception
//        names2.remove("John");
//        names2.remove("Jane");
        for(String name : names2) {
            System.out.println(name);
        }

    }
}
