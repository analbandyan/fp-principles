package com.fp.principles.side_effects.exceptions.functional_style.v2.support;

import java.util.Objects;
import java.util.Optional;

public class Try<T, R> {

    private final Function<T, R> fn;
    
    private Function<Exception, Optional<R>> onFailure;

    private Try(Function<T, R> fn) {
        this.fn = fn;
    }

    public static <T, R> Try<T, R> of(Function<T, R> fn) {
        return new Try<>(fn);
    }

    public Try<T, R> onFailure(Function<Exception, Optional<R>> onFailure) {
        this.onFailure = onFailure;
        return this;
    }

    public <V> Function<T, V> andThen(Function<Optional<R>, ? extends V> after) {
        Objects.requireNonNull(after);
        return t -> {
            Optional<R> thisResult = applyThis(t);
            return after.apply(thisResult);
        };
    }

    private Optional<R> applyThis(T t) {
        try {
            R res = fn.apply(t);
            return Optional.ofNullable(res);
        } catch (Exception ex) {
            if (onFailure != null) {
                return onFailure.apply(ex);
            }
            throw ex;
        }
    }

}
