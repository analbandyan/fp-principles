package com.fp.principles.other.recursion

import groovy.transform.CompileStatic
import groovy.transform.TailRecursive
import groovy.transform.TypeChecked

@CompileStatic
@TypeChecked
class TailRecursion {

    static long sum(long number) {
        return summary(number, 0)
    }

    @TailRecursive
    private static long summary(long number, long sum) {
        if (number == 0) {
            return sum
        } else {
            long numberNext = number - 1
            long sumNext = sum + number
            return summary(numberNext, sumNext)
        }
    }

}
