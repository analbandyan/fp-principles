package com.fp.principles.basic.principles;

import com.fp.principles.basic.BasicGenericFunctions;

import java.util.List;

import static com.fp.principles.basic.BasicGenericFunctions.print;

public class HigherOrderFunctions {

    public static void main(String[] args) {
        var list = List.of(1, 2, 3, 4, 5);
        var result = list.stream()
                .filter(BasicGenericFunctions::isOdd) // 1, 3, 5
                .map(HigherOrderFunctions::square) // 1, 9, 25
                .reduce(0, Integer::sum); // 35
        print(result);
    }

    static Integer square(Integer i) {
        return i * i;
    }

}
