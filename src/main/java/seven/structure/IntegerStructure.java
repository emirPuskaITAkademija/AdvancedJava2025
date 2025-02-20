package seven.structure;

// 16

import java.util.Iterator;

//Zbog toga što klasa implementira Iterable ja mogu objekat kreiran po šablonu ove klase koristiti
// unutar ENHANCED FOR LOOP ?
// Međutim dobijem tzv NPE
// Iterable<Integer> me dalje tjera da implementiram njegovu metodu koja se zove iterator()
// Odnosno zahtjeva da definiram način na koji ću iterirati kroz elemenente svoje strukture
public class IntegerStructure implements Iterable<Integer> {
    private static final int SIZE = 16;

    private Integer[] numbers = new Integer[SIZE];

    public IntegerStructure() {
        for (int i = 0; i < SIZE; i++) {
            numbers[i] = i;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
//        return new EvenIterator();
        return new OddIterator();
    }

    //PARNO
    private class EvenIterator implements Iterator<Integer> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            System.out.println("Imal još pita hasNext() :" + (index <= SIZE - 1));
            return index <= SIZE - 1;
        }

        @Override
        public Integer next() {
            Integer number = numbers[index];
            index = index+2;
            System.out.println("Ima kaže next() i evo ti number = " + number);
            return number;
        }
    }

    private class OddIterator implements Iterator<Integer> {
        private int index = 1;

        @Override
        public boolean hasNext() {
            System.out.println("hashNext() => Pita ENHANCED FOR loop ima li još = " + (index <= SIZE - 1));
            return index<=SIZE-1;
        }

        @Override
        public Integer next() {
            Integer number = numbers[index];
            System.out.println("next() => Dodjeljuje ENHANCED FOR loop varijabli petlje vrijednost = "+number);
            index = index+2;
            return number;
        }
    }
}
