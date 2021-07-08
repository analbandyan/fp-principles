package com.fp.principles.dive.io.cases;

import java.util.function.Function;

import static com.fp.principles.dive.io.IOGenericFunctions.format;
import static java.lang.System.out;

public class IOv5 {

    //PURE FUNCTION
    public static Function<Void, Void> convertToCelsius() {
        Function<Void, Void> action1 = println("Enter the temperature in fahrenheit degrees:");
        double celsius = fahrenheitToCelsius(80);//not a real input
        Function<Void, Void> action2 = println(celsiusMessage(celsius));
        Function<Void, Void> action = action1.andThen(action2);//composition
        return action;
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
    private static Function<Void, Void> println(String message) {
        return (v) -> {
            out.println(message);
            return null;
        };
    }
}
