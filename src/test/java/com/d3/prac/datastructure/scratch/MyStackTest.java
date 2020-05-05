package com.d3.prac.datastructure.scratch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyStackTest {

    @Test
    public void testMyStack_Ok() {
        MyStack myStack = new MyStack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        assertEquals(myStack.pop(), 3);
        assertEquals(myStack.pop(), 2);
        assertEquals(myStack.pop(), 1);
    }
}