package com.fp.principles.side_effects.exceptions.functional_style.v1;

import java.util.function.Consumer;

public class DemoExceptionsFunctionalV1 {

    public static void main(String[] args) {
        Consumer<String> convertToNumberSuccess = ExceptionProneFunctionalV1.convertToNumber();
        convertToNumberSuccess.accept("two");

        Consumer<String> convertToNumberFailure = ExceptionProneFunctionalV1.convertToNumber();
        convertToNumberFailure.accept("not-a-number");
    }

}