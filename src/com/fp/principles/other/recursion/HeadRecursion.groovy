package com.fp.principles.other.recursion

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked

@CompileStatic
@TypeChecked
class HeadRecursion {

    static long sum(long number) {
        if (number == 0) {
            return 0
        }
        return number + sum(number - 1)
    }

}
