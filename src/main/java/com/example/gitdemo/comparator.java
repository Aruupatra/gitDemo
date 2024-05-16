package com.example.gitdemo;

import java.util.Comparator;

public class comparator implements Comparator<car> {

    @Override
    public int compare(car o1, car o2) {
        return o1.number-o2.number;
    }
}
