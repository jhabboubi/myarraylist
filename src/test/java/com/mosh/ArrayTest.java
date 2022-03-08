package com.mosh;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ArrayTest {
    Array<Integer> arr = null;

    @BeforeEach
    public void setUp() {
        arr = new Array<>();
    }

    @Test
    void print() {
        assertEquals("[null,null,null,null,null,null,null,null,null,null]", arr.print());
    }

    @Test
    void initArray() {
        assertEquals(10, arr.getLength());
    }

    @Test
    void insert() {
        arr.insert(10);
        arr.insert(20);
        arr.insert(30);
        arr.insert(40);
        arr.insert(50);
        arr.insert(60);
        arr.insert(70);
        arr.insert(80);
        arr.insert(90);
        arr.insert(100);
        arr.insert(110);
        arr.insert(120);
        assertEquals(10,arr.getContent(0));
        assertEquals(20,arr.getContent(1));
        assertEquals(30,arr.getContent(2));
        assertEquals(40,arr.getContent(3));
        assertEquals(50,arr.getContent(4));
        assertEquals(60,arr.getContent(5));
        assertEquals(70,arr.getContent(6));
        assertEquals(80,arr.getContent(7));
        assertEquals(90,arr.getContent(8));
        assertEquals(100,arr.getContent(9));
        assertEquals(110,arr.getContent(10));
        assertEquals(120,arr.getContent(11));
        assertEquals(20,arr.getLength());
    }

    @Test
    void removeAt() {
        arr.insert(10);
        arr.removeAt(0);
        assertNull(arr.getContent(0));
    }

    @Test
    void indexOf() {
        arr.insert(100);
        arr.indexOf(100);
        assertEquals(0,arr.indexOf(100));
    }

    @Test
    void getLength() {
        assertEquals(10,arr.getLength());
    }

}