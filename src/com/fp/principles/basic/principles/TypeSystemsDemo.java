package com.fp.principles.basic.principles;

public class TypeSystemsDemo {

    public static void main(String[] args) {
        int result1 = add(1, 2); // ok
//        int result2 = add(3, "4"); // not ok: invalid argument type - compile error
//        boolean result3 = add(5, 6); // not ok: invalid assignment - compile error
//        int result4 = otherFunction(5, 6); // not ok: calling not existing function - compile error
    }

    private static int add(int left, int right) {
        return left + right;
    }

}
