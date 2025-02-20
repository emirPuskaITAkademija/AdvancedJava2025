package seven.structure;

import java.util.Arrays;
import java.util.Iterator;

//E - UNBOUNDED
// E extends Number  - BOUNDED GENERIC
public class DynamicNumberStructure<E extends Number> implements Iterable<E> {
    private int capacity = 0;
    private E[] numbers = (E[]) new Number[capacity];

    public DynamicNumberStructure() {
    }

    public void addNumber(E number) {
        capacity++;
        numbers = Arrays.copyOfRange(numbers, 0, capacity);
        numbers[capacity - 1] = number;
    }

    @Override
    public Iterator<E> iterator() {
        return new NumberIterator();
    }


    private class NumberIterator implements Iterator<E> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            boolean hasNext = index < capacity;
            System.out.println("hasNext() : " + hasNext);
            return hasNext;
        }

        @Override
        public E next() {
            E number = numbers[index];
            System.out.println("next() : " + number + " on index: " + index);
            index++;
            return number;
        }
    }
}
