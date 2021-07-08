package com.fp.principles.basic.principles.pure;

import java.util.Random;

import static com.fp.principles.basic.BasicGenericFunctions.print;

public class ExternalWorld {

    public static boolean THROW_EXCEPTION = false;

    public static boolean getTrue() {
        return true;
    }

    public static boolean getRandomBoolean() {
        return new Random().nextBoolean();
    }

    public static void log(Object obj) {
        checkThrowException();
        print("log: " + obj);
    }

    private static void checkThrowException() {
        if (THROW_EXCEPTION) {
            throw new RuntimeException("test exception");
        }
    }

}
