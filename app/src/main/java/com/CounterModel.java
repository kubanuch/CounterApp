package com;

public class CounterModel {
    int count = 0;
    String message = "hello";
    void increment(){
        ++count;
    }
    void decrement(){
        --count;
    }

    public int getCount() {
        return count;
    }

    public String getMessage() {
        return message;
    }
}
