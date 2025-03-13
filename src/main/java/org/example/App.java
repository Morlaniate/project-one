package org.example;

import org.example.model.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import java.util.function.Function;

public class App {

    public static Book getMinValueBy(List<Book> books, Function<Book, Integer> function) {
        List<Book> sortedBooks = new ArrayList<>(books);
        sortedBooks.sort(Comparator.comparing(function));
        return sortedBooks.getFirst();
    }


}