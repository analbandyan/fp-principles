package com.fp.principles.dive.exceptions.functional_style.v2.support;

import java.util.Objects;

@FunctionalInterface
public interface Function<T, R> {

    R apply(T t);

    default <V> Function<T, V> andThen(Function<R, V> after) {
        Objects.requireNonNull(after);
        return (T t) -> after.apply(apply(t));
    }

    default <V> Try<T, V> andThenTry(Function<R, V> after) {
        Objects.requireNonNull(after);
        return Try.of((T t) -> after.apply(apply(t)));
    }

    static <T> Function<T, T> identity() {
        return t -> t;
    }

}