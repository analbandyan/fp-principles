package com.fp.principles.side_effects.exceptions.functional_style.v2;

import com.fp.principles.side_effects.exceptions.functional_style.v2.support.Function;

import java.util.Optional;

public class ExceptionProneFunctionalV2 {

    public static Function<String, Integer> plusOne() {
        return Function.<String>identity()
                .andThenTry(toInteger())
                .onFailure(handleParseFailure())
                .andThen(handleAddOne());
    }

    private static Function<Exception, Optional<Integer>> handleParseFailure() {
        return ex -> {
            System.out.println("Failed to parse string to integer: " + ex.getMessage());
            return Optional.empty();
//            could be anything else, like Optional.of(0), Optional.of(-1), etc...;
        };
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

    private static Function<Optional<Integer>, Integer> handleAddOne() {
        return opt -> {
            Integer val = opt.orElse(0);
            return addOne(val);
        };
    }

    private static Integer addOne(Integer number) {
        return number + 1;
    }

}
