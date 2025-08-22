package org.example;

import org.example.model.Film;
import org.example.model.Person;
import org.example.model.Product;
import org.example.model.User;

import java.util.*;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.Comparator;

public class App {

    private static final List<String> FREE_DOMAINS = List.of(
            "gmail.com",
            "yandex.ru",
            "hotmail.com",
            "yahoo.com"
    );

    public static List<Integer> sameParityFilter(List<Integer> coll) {
        if (coll == null || coll.isEmpty()) {
            return List.of();
        }

        boolean firstParity = coll.getFirst() % 2 == 0;

        return coll.stream()
                .filter(num -> num % 2 == 0 == firstParity)
                .toList();

    }

    public static Integer getSecondBiggest(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
    }

    public static User findUserById(List<User> users, long id) {

        return users.stream()
                .filter(u -> id == (u.getId()))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    public static Map<String, Long> getGenres(List<Film> films) {
        return films.stream()
                .flatMap(film -> film.getGenres().stream()
                        .map(String::toLowerCase))
                .collect(Collectors.groupingBy(
                        genre -> genre,
                        Collectors.counting()));
    }

    public static Map<String, Long> getFreeDomainsCount(List<String> urls) {
        return urls.stream()
                .map(url -> url.split("@")[1])
                .filter(FREE_DOMAINS::contains)
                .collect(Collectors.groupingBy(domain -> domain, Collectors.counting()));
    }

    public static Integer getTotalPrice(List<Product> goods) {
        return goods.stream()
                .filter(good -> "electronics".equals(good.getCategory()))
                .map(Product::getPrice)
                .reduce(0, Integer::sum);
    }

//    public static ArrayList<Integer> duplicate(ArrayList<Integer> numbers) {
//        UnaryOperator<Integer> multuplier = number -> number * 2;
//        var duplucatedNumbers = (new ArrayList<Integer>(numbers));
//        duplucatedNumbers.replaceAll(multuplier);
//        return duplucatedNumbers;
//    }
//
//    public static List<String> sortWords(ArrayList<String> words) {
//        var result = words.stream().sorted().toList();
//        return result;
//    }
//
//    public static List<String> normalize(List<String> emails) {
//        return emails.stream()
//                .map(String::toLowerCase)
//                .map(String::trim)
//                .toList();
//    }
//
//    public static List<String> getAdultUserNames(List<Person> users) {
//        return users.stream()
//                .filter(user -> user.getAge() >= 18)
//                .map(Person::getName)
//                .toList();
//    }
//
//    public static Double getAverageAge(List<Person> persons) {
//
//        if (persons.isEmpty()) {
//            return null;
//        }
//
//        double totalAge = persons.stream()
//                .reduce(0.0,
//                        (sum, person) -> {
//                            var age = person.getAge();
//                            return sum + age;
//                        },
//                        Double::sum
//                );
//
//        return totalAge / persons.size();
//
//
////        return persons.stream().
////                mapToDouble(Person::getAge)
////                .average();
//
//    }

}

