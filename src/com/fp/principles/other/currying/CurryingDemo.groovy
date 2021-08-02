package com.fp.principles.other.currying

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked

@CompileStatic
@TypeChecked
class CurryingDemo {


    static void main(String[] args) {
        def times = { int x, int y ->
            x * y
        }

        println times(2, 3)

        def timesTwo = times.curry(2)
        println timesTwo(3)

        println times.curry(2)(3)
    }


}
