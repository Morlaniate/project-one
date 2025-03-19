package org.example;

import org.example.model.Human;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListUtils<T> {

    public static Integer findFirstIndex(List<? extends Human> humans, String prefix) {

        for (var human : humans) {
            if (human.getName().startsWith(prefix)) {
                return humans.indexOf(human);
            }
        }
        return -1;
    }

    public List<T> merge(List<T> coll1, List<T> coll2) {
        List<T> resultColl = new ArrayList<>();
        resultColl.addAll(coll1);
        resultColl.addAll(coll2);
        return resultColl;
    }

    public static <T> List<T> filter (List<T> elements, Predicate<T> function) {
        List<T> result = new ArrayList<>();
        for (T element : elements) {
            if (function.test(element)) {
                result.add(element);
            }
        }
        return result;
    }
}
