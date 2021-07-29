package com.fp.principles.dive.exceptions.non_functional_style;

import java.util.function.Function;

public class ExceptionProneNonFunctional {

    public static Function<String, Integer> plusOne() {
        return Function.<String>identity()
                .andThen(toInteger())
                .andThen(addOne());
    }

    private static Function<String, Integer> toInteger() {
        return str -> parseToInteger(str);//<<<--- EXCEPTION PRONE
    }

    //PURE FUNCTION
    private static Integer parseToInteger(String str) {
        switch (str) {
            case "one":
                return 1;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            default:
                //would be even worse with checked exceptions
                throw new IllegalArgumentException("Unsupported number text: " + str);//<<<--- EXCEPTION!!!
        }
    }

    private static Function<Integer, Integer> addOne() {
        return number -> number + 1;
    }

}
