package org.example.implementations;

import java.util.List;

public class AddWrong4 {
    public static <T> boolean add(List<T> coll, T element) {
        coll.add(element);
        return false;
    }

    public static <T> boolean add(List<T> coll, T element, int index) {
        coll.add(index, element);
        return false;
    }
}
