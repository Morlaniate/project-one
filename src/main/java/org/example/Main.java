package org.example;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("input a number");
        int num = in.nextInt();
        System.out.printf("your number: %d \n", num);
        in.close();
    }
}
