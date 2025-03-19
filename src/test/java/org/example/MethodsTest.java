package org.example;

import net.datafaker.Faker;
import org.example.model.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import static org.example.Methods.toHtmlList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MethodsTest {

    private static List<User> users = new ArrayList<>();

    // BEGIN (write your solution here)

    static Faker faker = new Faker();

    @BeforeAll
    public static void addUsers() {
       for (int i = 0; i <= 10; i++) {
           users.add(new User(
                   faker.name().firstName(),
                   faker.name().lastName(),
                   faker.internet().emailAddress()));
        }
    }
//    private static String expected;
//
//
////    @BeforeAll
////    public static void beforeAll() throws Exception {
////        expected = readFixture("result.html");
////    }
//
//    public static Path getFixturePath(String fileName) {
//        return Paths.get("src", "test", "resources", "fixtures", fileName)
//                .toAbsolutePath().normalize();
//    }
//
//    private static String readFixture(String fileName) throws Exception {
//        var path = getFixturePath(fileName);
//        return Files.readString(path).trim();
//    }
//
//    private static Stream<String> filePaths() throws Exception {
//        return Stream.of(
//                getFixturePath("list.json").toString(),
//                getFixturePath("list.yaml").toString(),
//                getFixturePath("list.yml").toString()
//        );
//    }
//
//    @ParameterizedTest
//    @MethodSource("filePaths")
//    public void testToHtml(String filePath) throws Exception {
//        var actual = toHtmlList(filePath).replaceAll("\\R", "");
//        expected = expected.replaceAll("\\R", "");
//        assertEquals(expected, actual);
//    }
}
