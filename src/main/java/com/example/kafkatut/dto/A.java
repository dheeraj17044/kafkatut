package com.example.kafkatut.dto;

import java.io.Serializable;

public class A implements Serializable {
    private String a;
    private int b;

    public A(String a, int b) {
        this.a = a;
        this.b = b;
    }

    public A() {
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "A{" +
                "a='" + a + '\'' +
                ", b=" + b +
                '}';
    }
}
