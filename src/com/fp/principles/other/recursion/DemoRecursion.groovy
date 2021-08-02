package com.fp.principles.other.recursion

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked

@CompileStatic
@TypeChecked
class DemoRecursion {

    static void main(String[] args) {
        demoHeadRecursion()
//        demoTailRecursion()
    }

    private static void demoHeadRecursion() {
        long sumHead = HeadRecursion.sum(1_000)
//        long sumHead = HeadRecursion.sum(10_000)
        println("sumHead = " + sumHead)
    }

    private static void demoTailRecursion() {
        long sumTail = TailRecursion.sum(10_000)
//        long sumTail = TailRecursion.sum(100_000)
        println("sumTail = " + sumTail)
    }

}
