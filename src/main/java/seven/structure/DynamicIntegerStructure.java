package seven.structure;

import java.util.Arrays;
import java.util.Iterator;

public class DynamicIntegerStructure implements Iterable<Integer> {
    private int capacity = 0;
    private Integer[] numbers = new Integer[capacity];

    public DynamicIntegerStructure() {
    }

    public void addInteger(Integer number) {
        capacity++;
        numbers = Arrays.copyOfRange(numbers, 0, capacity);
        numbers[capacity - 1] = number;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new DynamicIntegerIterator();
    }


    private class DynamicIntegerIterator implements Iterator<Integer> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            boolean hasNext = index < capacity;
            System.out.println("hasNext() : " + hasNext);
            return hasNext;
        }

        @Override
        public Integer next() {
            Integer number = numbers[index];
            System.out.println("next() : " + number + " on index: " + index);
            index++;
            return number;
        }
    }
}
