package com;

public class Injector {
    public static CounterPresenter attachPresenter(){
        return new CounterPresenter();
    }
}
