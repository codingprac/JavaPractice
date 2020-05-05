package com.d3.prac.datastructure.scratch;

import java.util.Arrays;

public class MyStack {

    private int size;
    private int DEFAULT_CAPACITY = 10;
    private Object[] elements = new Object[DEFAULT_CAPACITY];

    // TODO : push, pop, size

    public Object pop() {
        Object value = null;
        if(elements.length > 0) {
            size--;
            value = elements[size];
            elements[size] = null;
        }
        return value;
    }

    public void push(Object item) {
        ensureCapacity();
        elements[size++] = item;
    }

    private void ensureCapacity() {
        if(size == elements.length) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
    }

    public int size() {
        return size;
    }

}
