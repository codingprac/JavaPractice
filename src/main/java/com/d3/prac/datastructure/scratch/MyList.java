package com.d3.prac.datastructure.scratch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList<E> {

    // TODO: add, remove, get

    private int size;
    private final int DEFAULT_CAPACITY = 2;
    private Object[] elements = new Object[DEFAULT_CAPACITY];

    public void add(Object obj) {
        ensureCapacity();
        elements[size] = obj;
        size++;
    }

    public Object get(int index) {
        if(index >=0 && index < size) {
            return elements[index];
        }
        return null;
    }

    public void remove(int index) {
        if(index >=0 && index < size) {
            elements[index] = null;
            for(int i = index; i < size-1; i++) {
                elements[i] = elements[i++];
            }
            elements[size-1] = null;
            size--;
        }
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        if(size == elements.length) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
    }

}
