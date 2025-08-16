package org.example;

import org.example.model.Person;
import org.example.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class App {

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

