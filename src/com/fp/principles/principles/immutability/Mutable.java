package com.fp.principles.principles.immutability;

import java.util.List;

public class Mutable {

    private int i;
    private int j;
    private List<Integer> list;

    Mutable(int i, int j, List<Integer> list) {
        this.i = i;
        this.j = j;
        this.list = list;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Mutable{" +
                "i=" + i +
                ", j=" + j +
                ", list=" + list +
                '}';
    }

}
