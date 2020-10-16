package com.d3.prac.datastructure.scratch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class MyListTest {

    @Test
    public void testMyList_Ok() {
        MyList myList = new MyList();

        myList.add(10);
        myList.add(12);
        myList.add(100);
        myList.add(500);

        assertEquals(myList.get(3), 500);

        myList.remove(3);

        assertEquals(myList.size(), 3);
    }

}