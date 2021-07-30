package com.fp.principles.principles.higher_order_functions;

import com.fp.principles.principles.GenericFunctions;

import java.util.List;

import static com.fp.principles.principles.GenericFunctions.print;

public class DemoHigherOrderFunctions {

    public static void main(String[] args) {
        var list = List.of(1, 2, 3, 4, 5);
        var result = list.stream()
                .filter(GenericFunctions::isOdd) // 1, 3, 5
                .map(DemoHigherOrderFunctions::square) // 1, 9, 25
                .reduce(0, Integer::sum); // 35
        print(result);
    }

    static Integer square(Integer i) {
        return i * i;
    }

}
