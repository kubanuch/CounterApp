package com.example.counterapp.mvp;


public class CounterModel {
    int count = 0 ;
    String message = "Здарова";


    void increment() {
        ++count;

    }

    void decrement() {
        -- count;

    }

    public int getCount() {
        return count;
    }

    public String getMessage() {
        return message;
    }
}

