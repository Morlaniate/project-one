package org.example.implementations;

import java.util.List;

public class AddWrong3 {
    public static <T> boolean add(List<T> coll, T element) {
        return coll.add(element);
    }

    public static <T> boolean add(List<T> coll, T element, int index) {
        return coll.add(element);
    }
}
