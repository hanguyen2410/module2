package bai3;

import java.util.Arrays;
import java.util.ArrayList;

public class MyList<E> {
    private int size = 0;
    private static int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (index >= elements.length) {
            ensureCapacity();
        }
        elements[index] = element;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index" + index + "out of bounds");
        }
    }

    public E remove(int index) {
        checkIndex(index);
        E temp = (E) elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[index + 1];
        }
        elements[size - 1] = null;
        size--;
        return temp;
    }

    public int size() {
        return size;
    }

    public boolean contains(E e) {
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            if (e.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public boolean add(E e) {
        return false;
    }

    public int lastIndexOf(E e) {
        for (int i = size; i < size; i--) {
            if (e.equals(elements[i])) ;
            return i;
        }
        return -1;
    }

    public E get(int index) {
        if (index < 0 || index > DEFAULT_CAPACITY) {
            throw new IndexOutOfBoundsException("Index : " + index + ", size : " + index);
        }
        return (E) elements[index];
    }

    public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void printMyList() {
        int i = 0;
        for (E e : (E[]) elements) {
            System.out.println("Element " + i + " : " + e);
            i++;
        }
    }
}
