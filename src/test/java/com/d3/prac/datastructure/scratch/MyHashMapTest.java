package com.d3.prac.datastructure.scratch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHashMapTest {

    @Test
    public void testMyHashMap_Ok() {
        MyHashMap<String, String> myHashMap = new MyHashMap<>();

        myHashMap.put("Crypto", "Scout");
        myHashMap.put("Bangalore", "Agressive");
        myHashMap.put("Gibraltar", "Defensive");
        myHashMap.put("PathFinder", "Medic");
        myHashMap.put("LifeLine", "Medic");
        myHashMap.put("Bloodhound", "Scout");
        myHashMap.put("Mirage", "Holographic");
        myHashMap.put("Caustic", "Defensive");

        assertEquals(myHashMap.size(), 8);
        assertEquals(myHashMap.get("Crypto"), "Scout");
        assertEquals(myHashMap.get("Bangalore"), "Agressive");
        assertEquals(myHashMap.get("Gibraltar"), "Defensive");
        assertEquals(myHashMap.get("PathFinder"), "Medic");
        assertEquals(myHashMap.get("LifeLine"), "Medic");
        assertEquals(myHashMap.get("Bloodhound"), "Scout");
        assertEquals(myHashMap.get("Mirage"), "Holographic");
        assertEquals(myHashMap.get("Caustic"), "Defensive");
    }

}