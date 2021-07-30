package com.fp.principles.side_effects.exceptions.functional_style.v1;

import com.fp.principles.side_effects.exceptions.functional_style.v1.support.Try;

import java.util.function.Consumer;
import java.util.function.Function;

public class ExceptionProneFunctionalV1 {

    public static Consumer<String> convertToNumber() {
        return Try.of(toInteger())
                .onSuccess(successHandler())
                .onFailure(failureHandler())
                .toConsumer();
    }

    private static Consumer<Integer> successHandler() {
        return i -> System.out.println("the converted number is " + i);
    }

    private static Consumer<Exception> failureHandler() {
        return ex -> System.out.println("cannot convert to number: " + ex.getMessage());
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
                throw new IllegalArgumentException("Unsupported number text: " + str);//<<<--- EXCEPTION!!!
        }
    }

}
