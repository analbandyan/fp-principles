package com.fp.principles.basic.principles.pure;

import static com.fp.principles.basic.BasicGenericFunctions.print;
import static com.fp.principles.basic.BasicGenericFunctions.printNewLineAndData;

public class DemoImpureFunctions {

    public static void main(String[] args) {
        demoImpureSquare1();
        demoImpureSquare2();
        demoImpureSquareWithLog();
    }

    private static void demoImpureSquare1() {
        printNewLineAndData("DEMO IMPURE FUNCTION SQUARE1");

        var impureFunction = new ImpureFunctions(2);

        int squareVal1 = impureFunction.square1();
        print(squareVal1);

        impureFunction.setInput(3);
        int squareVal2 = impureFunction.square1();
        print(squareVal2);
    }

    private static void demoImpureSquare2() {
        printNewLineAndData("DEMO IMPURE FUNCTION SQUARE2");

        var impureFunction = new ImpureFunctions(2);

        int squareVal1 = impureFunction.square2(2);
        print(squareVal1);

        int squareVal2 = impureFunction.square2(2);
        print(squareVal2);
    }

    private static void demoImpureSquareWithLog() {
        printNewLineAndData("DEMO IMPURE FUNCTION SQUARE_WITH_LOG");

        int squareVal1 = ImpureFunctions.squareWithLog(2);
        print(squareVal1);

        ExternalWorld.THROW_EXCEPTION = true;
        int squareVal2 = ImpureFunctions.squareWithLog(2);
        print(squareVal2);
    }


}
