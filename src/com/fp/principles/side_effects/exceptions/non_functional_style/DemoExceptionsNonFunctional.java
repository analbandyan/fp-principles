package com.fp.principles.side_effects.exceptions.non_functional_style;

import java.util.function.Function;

public class DemoExceptionsNonFunctional {

    public static void main(String[] args) {
        Function<String, Integer> func_success = ExceptionProneNonFunctional.plusOne();
        Integer result_success = func_success.apply("two");
        System.out.println("success result = " + result_success);

        Function<String, Integer> func_failure = ExceptionProneNonFunctional.plusOne();
        Integer result_failure = func_failure.apply("not-a-number");
        System.out.println("failure result = " + result_failure);
    }

}