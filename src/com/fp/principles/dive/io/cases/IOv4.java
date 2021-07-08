package com.fp.principles.dive.io.cases;

import java.util.function.Function;

import static com.fp.principles.dive.io.IOGenericFunctions.format;
import static java.lang.System.out;

public class IOv4 {

    //PURE FUNCTION
    public static Function<Void, Void> convertToCelsius(double fahrenheit) {
        double celsius = fahrenheitToCelsius(fahrenheit);
        return println(celsiusMessage(celsius));
    }

    //PURE FUNCTION
    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    //PURE FUNCTION
    private static String celsiusMessage(double celsius) {
        return "Temperature in celsius is " + format(celsius);
    }

    //PURE FUNCTION
    //instead of actually doing the side effect, it is just returning an action that
    //when interpreted, will produce the side effect!
    //Runnable is just a description of operation here!
    private static Function<Void, Void> println(String message) {
        return (v) -> {
            out.println(message);
            return null;
        };
    }


}
