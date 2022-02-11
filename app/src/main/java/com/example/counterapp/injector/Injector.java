package com.example.counterapp.injector;

import com.example.counterapp.mvp.CounterPresenter;

public class Injector {
    public static CounterPresenter attachPresenter(){
        return new CounterPresenter();
    }
}
