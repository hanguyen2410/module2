package bai3;

import java.util.Arrays;
import java.util.ArrayList;
public class MyList<E> {
    private int size = 0;
    private static int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity) {
        elements = new Object[capacity];
    }
    public void add(int index, E element) {
        for (int i = size - 1 ; i >= index; i-- )
            elements[i + 1] = elements[i];
        elements[index] = element;
        size ++;
    }
    public void remove(int index){
        if(index >= elements.length) {
           int newSize = elements.length *2;
           elements = Arrays.copyOf(elements,newSize);
        }
        for (int i = index; i <= elements.length; i++  ) {
            elements[index+1] = elements[index];

        }
    }

}
