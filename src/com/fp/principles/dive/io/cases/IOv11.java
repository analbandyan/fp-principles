package com.fp.principles.dive.io.cases;

import java.util.function.Function;

import static com.fp.principles.dive.io.IOGenericFunctions.*;

public class IOv11 {

    //impure function
    public static Runnable convertToCelsius(Function<Void, String> ioInput, Function<String, Void> ioOutput) {
        Function<Void, Void> action = given("Enter the temperature in fahrenheit degrees:")
                .andThen(ioOutput)
                .andThen(ioInput)
                .andThen(stringToDouble())
                .andThen(fahrenheitToCelsius())
                .andThen(celsiusMessage())
                .andThen(ioOutput);
        return toRunnable(action);
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
