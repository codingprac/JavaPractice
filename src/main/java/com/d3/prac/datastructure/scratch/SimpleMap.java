package com.d3.prac.datastructure.scratch;

import java.util.Arrays;
import java.util.LinkedList;

public class SimpleMap<K,V> {

    // TODO : put, hash

    private int size;
    private int DEFAULT_CAPACITY = 16;
    private Nodes<K,V>[] values;

    public SimpleMap() {
        values = new Nodes[DEFAULT_CAPACITY];
    }

    public void put(K key, V value) {
        checkSize();
        int index = hash(key) % values.length;
        if(values[index] == null) {
            values[index] = new Nodes(key, value, null);
            size++;
        } else if(values[index].getKey().equals(key)) {
            values[index].setValue(value);
        } else {
            values[index].next = new Nodes(key, value, null);
            size++;
        }
    }

    public V get(K key) {
        int index = hash(key) % values.length;
        Nodes<K, V> node = values[index];
        if(node.getKey().equals(key)) {
            return node.getValue();
        } else {
            while(node.next != null) {
                node = node.next;
                if(node.getKey().equals(key)) {
                    return node.getValue();
                }
            }
        }
        return null;
    }

    public int size() { return size; }

    private void checkSize() {
        if(size == values.length) {
            values = Arrays.copyOf(values, size * 2);
        }
    }

    static final int hash(Object key) {
        int hash = Math.abs(key.hashCode());
        return hash;
    }

    public void remove(K key) {
        int index = hash(key) % values.length;
        values[index] = null;
    }

}


class Nodes<K,V> {

    private final K key;
    private V value;
    Nodes<K, V> next;

    public Nodes(K key, V value, Nodes<K,V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public K getKey() { return key; }

    public V getValue() { return value; }

    public void setValue(V value) { this.value = value; }

    public Nodes<K, V> getNext() { return next; }

    public void setNext(Nodes<K, V> next) { this.next = next; }

}
