package com.fp.principles.basic.principles.immutability;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.fp.principles.basic.BasicGenericFunctions.print;
import static com.fp.principles.basic.BasicGenericFunctions.printNewLineAndData;

public class DemoImmutability {

    public static void main(String[] args) {
        mutableDemo();
        immutableDemo();
    }

    static void mutableDemo() {
        print("MUTABLE");

        var list = List.of(1, 2, 3);
        var mutable = new Mutable(1, 2, list);
        print(mutable);

        //mutating "mutable" object's state after creation
        mutable.setI(10);
        mutable.setJ(11);

        var list2 = new ArrayList<Integer>();
        mutable.setList(list2);
        print(mutable);

        list2.add(5);
        print(mutable);

        mutable.getList().add(6);
        print(mutable);
    }

    static void immutableDemo() {
        printNewLineAndData("IMMUTABLE");

        var list = new ArrayList<>(Arrays.asList(1, 2, 3));
        var immutable = new Immutable(1, 2, list);
        print(immutable);
//        immutable.setI(); //compile error - no setter available
//        immutable.setJ(); //compile error - no setter available
//        immutable.setList(); //compile error - no setter available

        list.add(4);
        print(immutable);

        immutable.getList().add(4); //UnsupportedOperationException
    }

}
