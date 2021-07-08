package com.fp.principles.dive.exceptions.triable.v2;

import com.fp.principles.dive.exceptions.triable.v2.support.Function;

public class DemoExceptionsTriableV2 {

    public static void main(String[] args) {
        Function<String, Integer> func_success = ExceptionProneTriableV2.plusOne();
        Integer result_success = func_success.apply("two");
        System.out.println("success result = " + result_success);

        Function<String, Integer> func_failure = ExceptionProneTriableV2.plusOne();
        Integer result_failure = func_failure.apply("not-a-number");
        System.out.println("failure result = " + result_failure);
    }

}