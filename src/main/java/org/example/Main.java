package org.example;

import org.apache.commons.lang3.ArrayUtils;

import java.util.*;

import static org.example.model.Fdf.slice;

public class Main {
    public static void main(String[] args) {
        var numbers = List.of(1, 2, 3, 4, 5);

//        var slice1 = slice(numbers, 1, 4);
//        System.out.println(slice1);

        var slice1 = slice(numbers, 1, 3);
        System.out.println("s1 = " + slice1);

        var slice2 = slice(numbers, 0, 4);
        System.out.println("s2 = " + slice2);

        var slice3 = slice(numbers, 0, 5);
        System.out.println("s3 = " + slice3);

        var slice4 = slice(numbers,0, 8);
        System.out.println("s4 = " + slice4);

        var slice5 = slice(numbers,8, 8);
        System.out.println("s5 = " + slice5);

        var slice6 = slice(numbers,-8, 8);
        System.out.println("s6 = " + slice6);

        var slice7 = slice(numbers,8, -8);
        System.out.println("s7 = " + slice7);

        var slice8 = slice(numbers, -4, -2);
        System.out.println("s8 = " + slice8);

        var slice9 = slice(new ArrayList<>(), 0, 2);

        System.out.println("s9 = " + slice9);

    }
}
