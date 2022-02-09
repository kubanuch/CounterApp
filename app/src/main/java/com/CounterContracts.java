package com;

public class CounterContracts {
     public interface CounterView{
         void UpdateCounter(int count);
         void showMessage(String message);
     }
     interface Presenter{
         void   increment();
         void attachView(CounterView counterView);
         void   decrement();
         void sendMessage();
     }
}
