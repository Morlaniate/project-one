package org.example.implementations;

import java.util.List;

public class AddWrong1 {
    public static <T> boolean add(List<T> coll, T element) {
        coll.add(0, element);
        return true;
    }

    public static <T> boolean add(List<T> coll, T element, int index) {
        coll.add(index, element);
        return true;
    }
}
