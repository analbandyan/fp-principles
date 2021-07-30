package com.fp.principles.principles.pure_functions;

import java.util.stream.IntStream;

import static com.fp.principles.principles.BasicGenericFunctions.print;
import static com.fp.principles.principles.BasicGenericFunctions.printNewLineAndData;

public class DemoPureFunctions {

    public static void main(String[] args) {
        demoPureSquare();
        demoPureAdd();
        demoPureIsTrue();
    }


    private static void demoPureSquare() {
        printNewLineAndData("DEMO PURE FUNCTION SQUARE");

        int squareVal = PureFunctions.square(2);
        print(squareVal);

        IntStream.range(0, 10)
                .forEach(i ->
                        print("square attempt " + i + ": result = " + PureFunctions.square(2))
                );
    }

    private static void demoPureAdd() {
        printNewLineAndData("DEMO PURE FUNCTION ADD");

        int addVal = PureFunctions.add(1, 2);
        print(addVal);

        IntStream.range(0, 10)
                .forEach(i ->
                        print("add attempt " + i + ": result = " + PureFunctions.add(1, 2))
                );
    }

    private static void demoPureIsTrue() {
        printNewLineAndData("DEMO PURE FUNCTION ISTRUE");

        boolean isTrueVal = PureFunctions.isTrue();
        print(isTrueVal);

        IntStream.range(0, 10)
                .forEach(i ->
                        print("isTrue attempt " + i + ": result = " + PureFunctions.isTrue())
                );
    }

}
