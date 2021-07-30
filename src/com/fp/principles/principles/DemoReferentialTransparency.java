package com.fp.principles.principles;

import static com.fp.principles.principles.BasicGenericFunctions.print;

public class DemoReferentialTransparency {

    public static void main(String[] args) {
        int four1 = two() + two(); //4
        print(four1);

        int four2 = two() + 2; //4
        print(four1);

        int four3 = 2 + two(); //4
        print(four1);

        int four4 = 2 + 2; //4
        print(four1);
    }

    static int two() {
        return 2;
    }

}
