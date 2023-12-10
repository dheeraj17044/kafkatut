package com.example.kafkatut.dto;

import java.io.Serializable;

public class B implements Serializable {
    private int c;
    private int d;

    public B(int c, int d) {
        this.c = c;
        this.d = d;
    }

    public B() {
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "B{" +
                "c=" + c +
                ", d=" + d +
                '}';
    }
}
