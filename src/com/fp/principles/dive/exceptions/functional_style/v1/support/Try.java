package com.fp.principles.dive.exceptions.functional_style.v1.support;

import java.util.function.Consumer;
import java.util.function.Function;

public class Try<T, R> {

    private final Function<T, R> fn;

    private Consumer<R> successHandler;

    private Consumer<Exception> failureHandler;

    private Try(Function<T, R> fn) {
        this.fn = fn;
    }

    public static <T, R> Try<T, R> of(Function<T, R> fn) {
        return new Try<>(fn);
    }

    public Try<T, R> onSuccess(Consumer<R> successHandler) {
        this.successHandler = successHandler;
        return this;
    }

    public Try<T, R> onFailure(Consumer<Exception> failureHandler) {
        this.failureHandler = failureHandler;
        return this;
    }

    public Consumer<T> toConsumer() {
        return (t) -> {
            try {
                R result = fn.apply(t);
                if(successHandler != null) {
                    successHandler.accept(result);
                }
            } catch (Exception ex) {
                if(failureHandler != null) {
                    failureHandler.accept(ex);
                } else {
                    throw ex;
                }
            }

        };
    }


}
