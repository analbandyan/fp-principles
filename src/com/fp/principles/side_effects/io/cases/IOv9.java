package com.fp.principles.side_effects.io.cases;

import java.util.function.Function;

import static com.fp.principles.side_effects.io.IOGenericFunctions.*;
import static java.lang.System.out;

public class IOv9 {

    //impure function
    public static Function<Void, Void> convertToCelsius() {
        return given("Enter the temperature in fahrenheit degrees:")
                .andThen(println())
                .andThen(readLine())
                .andThen(stringToDouble())
                .andThen(fahrenheitToCelsius())
                .andThen(celsiusMessage())
                .andThen(println());
    }

    //PURE FUNCTION
    private static Function<String, Void> println() {
        return (message) -> {
            out.println(message);
            return null;
        };
    }

    //PURE FUNCTION
    private static Function<Void, String> readLine() {
        return (v) -> readLineFromConsole();
    }

    //PURE FUNCTION
    private static Function<String, Double> stringToDouble() {
        return str -> Double.parseDouble(str);
    }

    //PURE FUNCTION
    private static Function<Double, Double> fahrenheitToCelsius() {
        return fahrenheit -> (fahrenheit - 32) * 5.0 / 9.0;
    }


    //PURE FUNCTION
    private static Function<Double, String> celsiusMessage() {
        return celsius -> "Temperature in celsius is " + format(celsius);
    }

}
