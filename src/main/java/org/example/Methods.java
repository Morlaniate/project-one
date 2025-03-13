package org.example;

import org.example.implementations.*;

public class Methods {
    private static String implementation = "right";

    public static void setImplementation(String implementationName) {
        implementation = implementationName;
    }

    public static Validator makeValidator() {
        return switch (implementation) {
            case "wrong1" -> new Wrong1();
            case "wrong2" -> new Wrong2();
            case "wrong3" -> new Wrong3();
            case "wrong4" -> new Wrong4();
            default -> new Right();
        };
    }
}