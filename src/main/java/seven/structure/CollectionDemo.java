package seven.structure;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        // numbersList -> List, ArrayList, Collection, Iterable
        List<Integer> numbersList = new ArrayList<Integer>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        //Zašto mogu koristiti numbersList varijablu direktno u ENHANCED for loop iza dvotačke ?
        // Jer je numbersList tipa Iterable
        for (Integer number : numbersList) {
            System.out.println(number);
        }

        IntegerStructure integerStructure = new IntegerStructure();
        for(Integer number : integerStructure) {
            System.out.println(number);
        }

    }
}
