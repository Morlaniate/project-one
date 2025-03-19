package org.example.model;

import java.util.List;
import java.util.ArrayList;

public class Fdf {

    public static <T> List<T> slice(List<T> coll, int begin, int end) {
        var collLength = coll.size();

        if (coll.isEmpty()) {
            return new ArrayList<T>();
        }

        var normalizedBegin = begin;
        var normalizedEnd = end;

        if (normalizedBegin < 0) {
            if (-normalizedBegin > collLength) {
                normalizedBegin = 0;
            } else {
                normalizedBegin += collLength;
            }
        }

        if (normalizedEnd < 0) {
            if (-normalizedEnd > collLength) {
                normalizedEnd = collLength - 1;
            } else {
                normalizedEnd += collLength;
            }
        }
        var limit = normalizedEnd - normalizedBegin > 0 ? normalizedEnd - normalizedBegin : 0;

        return coll.stream()
                .skip(normalizedBegin)
                .limit(limit)
                .toList();
    }
}
