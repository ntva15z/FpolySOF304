package com.myweb.unittest;

public class Caculator {
    private int a,b;

    public Caculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Caculator(){

    }

    public int sum(int a,int b){
        return a+b;
    }

    public int subtract(int a,int b){
        return a-b;
    }

    public int mutiple(int a,int b){
        return a*b;
    }

    public double divide(int a,int b) throws Exception {
        if(b==0){
            throw new Exception("wrong");
        }

        return (double)a/b;
    }
}
