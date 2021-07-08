package com.fp.principles.dive.exceptions.raw;

import java.util.function.Function;

public class DemoExceptionsRaw {

    public static void main(String[] args) {
        Function<String, Integer> func_success = ExceptionProneRaw.plusOne();
        Integer result_success = func_success.apply("two");
        System.out.println("success result = " + result_success);

        Function<String, Integer> func_failure = ExceptionProneRaw.plusOne();
        Integer result_failure = func_failure.apply("not-a-number");
        System.out.println("failure result = " + result_failure);
    }

}