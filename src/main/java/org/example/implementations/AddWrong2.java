package org.example.implementations;

import java.util.List;

public class AddWrong2 {
    public static <T> boolean add(List<T> coll, T element) {
        return coll.add(element);
    }

    public static <T> boolean add(List<T> coll, T element, int index) {

        if (coll.size() == index) {
            coll.add(0, element);
        } else {
            coll.add(index, element);
        }

        return true;
    }
}
