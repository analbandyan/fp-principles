package com.fp.principles.basic.principles.pure;

public class ImpureFunctions {

    private int input;

    private int result;

    ImpureFunctions(int i) {
        this.input = i;
    }

    int square1() {
        return input * input;
    }

    int square2(int i) {
        result = result + i * i;
        return result;
    }

    static int squareWithLog(int i) {
        int square = i * i;
        ExternalWorld.log(square);
        return square;
    }

    static boolean isTrue(boolean bool) {
        return bool == ExternalWorld.getTrue();
    }

    static boolean isTrue2(boolean bool) {
        return bool == ExternalWorld.getRandomBoolean();
    }

    public void setInput(int input) {
        this.input = input;
    }

}
