package com.fp.principles.principles.disciplined_state;

import java.util.ArrayList;
import java.util.List;

public class SharedMutableState {

    public static List<Integer> list = new ArrayList<>();

    public static List<Integer> getList() {
        return list;
    }

    public static void setList(List<Integer> list) {
        SharedMutableState.list = list;
    }

}
