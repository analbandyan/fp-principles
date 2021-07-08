package com.fp.principles.dive.exceptions.triable.v1;

import java.util.function.Consumer;

public class DemoExceptionsTriableV1 {

    public static void main(String[] args) {
        Consumer<String> convertToNumberSuccess = ExceptionProneTriableV1.convertToNumber();
        convertToNumberSuccess.accept("two");

        Consumer<String> convertToNumberFailure = ExceptionProneTriableV1.convertToNumber();
        convertToNumberFailure.accept("not-a-number");
    }

}