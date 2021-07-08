package com.fp.principles.basic.principles.state;

import com.fp.principles.basic.BasicGenericFunctions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.fp.principles.basic.BasicGenericFunctions.*;

public class DemoSharedMutableState {

    public static void main(String[] args) {
        SharedMutableState.list.add(1);

        printDataAndNewLine(SharedMutableState.list);

        addElements();
        printDataAndNewLine(SharedMutableState.list);

        addElements();
        printDataAndNewLine(SharedMutableState.list);

        removeEvenElements();
        printDataAndNewLine(SharedMutableState.list);

        doubleElementValues(SharedMutableState.list);
        printDataAndNewLine(SharedMutableState.list);

        refreshElements();
        printDataAndNewLine(SharedMutableState.list);

        complexOp();
        printDataAndNewLine(SharedMutableState.list);
    }

    private static void addElements() {
        print("addElements");
        IntStream.range(0, 10)
                .forEach(i -> SharedMutableState.list.add(getRandomInt()));
    }

    private static void removeEvenElements() {
        print("removeEvenElements");
        SharedMutableState.getList().removeIf(BasicGenericFunctions::isEven);
    }

    private static void refreshElements() {
        print("refreshElements");
        List<Integer> ints = IntStream.range(0, 10)
                .map(i -> getRandomInt())
                .boxed()
                .collect(Collectors.toList());
        SharedMutableState.setList(ints);
    }

    private static void doubleElementValues(List<Integer> list) {
        print("doubleElementValues");
        IntStream.range(0, list.size())
                .forEach(i -> list.set(i, list.get(i) * 2));
    }

    private static void complexOp() {
        print("::complexOp::");
        addElements();
        addElements();
        removeEvenElements();
        refreshElements();
    }

}
