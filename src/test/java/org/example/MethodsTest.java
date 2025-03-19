package org.example;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.example.Methods.add;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MethodsTest {

    List<Integer> list = new ArrayList<>();

    @BeforeEach
    public void init() {
        list.addAll(Arrays.asList(1,2,3,4,5));
    }

    @Test
    public void testAdd() {
        assertTrue(add(list, 6));
        assertEquals(list, List.of(1,2,3,4,5,6));
    }

    @Test
    public void testAddWithIndex() {
        assertTrue(add(list, 6, 1));
        assertEquals(list, List.of(1,6,2,3,4,5));
    }

    @Test
    public void testIndexEqualsListSize() {
        assertTrue(add(list,7, list.size()));
        assertEquals(list, List.of(1,2,3,4,5,7));
    }


}
