package seven.structure;

import java.util.Arrays;
import java.util.Iterator;

//E - UNBOUNDED
public class DynamicArray<E> implements Iterable<E> {

    private int capacity = 0;
    private E[] elements = (E[]) new Object[capacity];

    @Override
    public Iterator<E> iterator() {
        return new DynamicArrayIterator();
    }

    public void add(E element) {
        capacity++;
        elements = Arrays.copyOfRange(elements, 0, capacity);
        elements[capacity - 1] = element;
    }

    public void remove(int index) {
        if (index < 0 || index >= capacity) {
            return;
        }
        for (int i = index; i < capacity - 1; i++) {
            elements[i] = elements[i + 1];
        }
        capacity--;
        elements = Arrays.copyOfRange(elements, 0, capacity);
    }

    public void remove(E element) {
        int elementIndex = -1;
        for (int i = 0; i < capacity; i++) {
            if (elements[i].equals(element)) {
                elementIndex = i;
            }
        }
        remove(elementIndex);
    }

    private class DynamicArrayIterator implements Iterator<E> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < capacity;
        }

        @Override
        public E next() {
            E element = elements[index];
            index++;
            return element;
        }
    }
}
