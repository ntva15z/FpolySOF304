package com.myweb.unittest;

public class Number {
    private int a;

    public Number(int a) {
        this.a = a;
    }

    public boolean isEvenNumber(int a) {
        return a % 2 == 0;
    }

    public boolean isEvenNumber() {
        return a % 2 == 0;
    }
}
