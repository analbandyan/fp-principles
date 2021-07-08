package com.fp.principles.basic.principles.immutability;

import java.util.List;

public class Immutable {

    private final int i;
    private final int j;
    private final List<Integer> list;

    Immutable(int i, int j, List<Integer> list) {
        this.i = i;
        this.j = j;
        this.list = List.copyOf(list);
    }

    public int getI() {
        return i;
    }

//    public void setI(int i) {
//        this.i = i;
//    }

    public int getJ() {
        return j;
    }

//    public void setJ(int j) {
//        this.j = j;
//    }

    public List<Integer> getList() {
        return list;//list is immutable here
    }

//    public void setList(List<Integer> list) {
//        this.list = list;
//    }

    //+ some serialization/deserialization handling


    @Override
    public String toString() {
        return "Immutable{" +
                "i=" + i +
                ", j=" + j +
                ", list=" + list +
                '}';
    }

}
