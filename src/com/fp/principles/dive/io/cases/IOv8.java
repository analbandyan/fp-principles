package com.fp.principles.dive.io.cases;

import java.util.function.Function;

import static com.fp.principles.dive.io.IOGenericFunctions.format;
import static com.fp.principles.dive.io.IOGenericFunctions.readLineFromConsole;
import static java.lang.System.out;

public class IOv8 {

    //PURE FUNCTION
    public static Function<Void, Void> convertToCelsius() {
        Function<Void, Void> action1 = println("Enter the temperature in fahrenheit degrees:");
        Function<Void, String> promptUserReadCelsiusAction = action1.andThen(readLine());
        Function<Void, Double> readCelsiusAsDoubleAction = promptUserReadCelsiusAction.andThen(stringToDouble());
        Function<Void, Double> convertfahrenheitToCelsiusAction = readCelsiusAsDoubleAction.andThen(fahrenheitToCelsius());
        Function<Void, String> constructCelsiusMessageAction = convertfahrenheitToCelsiusAction.andThen(celsiusMessage());
        Function<Void, Void> fahrenheitToCelsiusAction = constructCelsiusMessageAction.andThen(println());
        return fahrenheitToCelsiusAction;
    }

    //PURE FUNCTION
    private static Function<Void, Void> println(String message) {
        return (v) -> {
            out.println(message);
            return null;
        };
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
