package com.fp.principles.side_effects.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.function.Function;

import static java.lang.System.out;

public class IOGenericFunctions {

    public static Function<String, Void> IO_OUTPUT = (message) -> {
        out.println(message);
        return null;
    };

    public static Function<Void, String> IO_INPUT = (v) -> readLineFromConsole();

    public static String readLineFromConsole() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return reader.readLine();
        } catch (IOException e) {
            //NOT GOOD - will come to this in "exceptions" section
            throw new RuntimeException(e);
        }
    }

    public static <T> Function<Void, T> given(T value) {
        return (v) -> value;
    }

    public static String format(double value) {
        return new DecimalFormat("#.0#").format(value);
    }

    public static Runnable toRunnable(Function<Void, Void> f) {
        return () -> f.apply(null);
    }

}
