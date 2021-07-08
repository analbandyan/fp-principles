package com.fp.principles.basic.principles.state;

import com.fp.principles.basic.BasicGenericFunctions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static com.fp.principles.basic.BasicGenericFunctions.*;

public class DemoDisciplinedState {

    public static void main(String[] args) {
        var list = List.of(1, 2, 3); // unmodifiable list

        printDataAndNewLine(list); //this and any other function cannot mutate the list

        var result1 = addElements(list);
        printDataAndNewLine(result1);

        var result2 = addElements(result1);
        printDataAndNewLine(result2);

        var result3 = removeEvenElements(result2);
        printDataAndNewLine(result3);

        var result4 = doubleElementValues(result3);
        printDataAndNewLine(result4);

        var result5 = complexOp(result4);
        printDataAndNewLine(result5);

        printDataAndNewLine(list); // still the same
    }

    private static List<Integer> addElements(List<Integer> list) {
        print("addElements");
        Stream<Integer> newElements = IntStream.range(0, 10)
                .map(i -> getRandomInt())
                .boxed();

        return Stream.concat(list.stream(), newElements)
                .collect(Collectors.toUnmodifiableList());

    }

    private static List<Integer> removeEvenElements(List<Integer> list) {
        print("removeEvenElements");
        return list.stream()
                .filter(BasicGenericFunctions::isOdd)
                .collect(Collectors.toUnmodifiableList());
    }


    private static List<Integer> doubleElementValues(List<Integer> list) {
        print("doubleElementValues");
        return list.stream()
                .map(i -> i * 2)
                .collect(Collectors.toUnmodifiableList());
    }

    private static List<Integer> complexOp(List<Integer> list) {
        print("::complexOp::");
        return doubleElementValues(
                removeEvenElements(
                        addElements(
                                addElements(list)
                        )
                )
        );
    }

}
