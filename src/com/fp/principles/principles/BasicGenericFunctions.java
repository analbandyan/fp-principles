package com.fp.principles.principles;

import java.util.Random;

public class BasicGenericFunctions {

    private static final Random random = new Random();

    public static Integer getRandomInt() {
        return random.nextInt(100);
    }

    public static boolean isEven(int i) {
        return !isOdd(i);
    }

    public static boolean isOdd(int i) {
        return i % 2 == 1;
    }

    public static void printNewLineAndData(Object obj) {
        print("\n\n" + obj);
    }

    public static void printDataAndNewLine(Object obj) {
        print(obj + "\n\n");
    }

    public static void printDataAndNewLine(String prefix, Object obj) {
        print(prefix, obj + "\n\n");
    }

    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static void print(String prefix, Object obj) {
        System.out.println(prefix + obj);
    }
}
