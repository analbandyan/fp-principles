package com.fp.principles.other.memoization

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked

@CompileStatic
@TypeChecked
class MemoizationDemo {

    static void main(String[] args) {
        println factorial(4)
        println factorial(3)
        println factorial(5)
    }

//    @Memoized
    private static long factorial(long num) {
        println "Factorial for $num"

        if (num == 0 || num == 1) {
            return 1;
        }

        factorial(num - 1) * num
    }

}
