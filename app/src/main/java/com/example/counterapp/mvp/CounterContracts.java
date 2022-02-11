package com.example.counterapp.mvp;

public class CounterContracts {
     public interface CounterView {
         void updateCounter(int count);
         void greenText();
         void showMessage(String message);
     }

    interface Presenter {

        void increment();


        void attachView(CounterView counterView);

        void decrement();

        void sendMessage();

        void colorText();


    }
}
