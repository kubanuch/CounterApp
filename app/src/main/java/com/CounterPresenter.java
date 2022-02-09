package com;

public class CounterPresenter  implements CounterContracts.Presenter {
    CounterModel counterModel;
    CounterContracts.CounterView counterView;

    public CounterPresenter() {
        counterModel = new CounterModel();
    }

    @Override
    public void increment() {
        counterModel.increment();
        counterView.UpdateCounter(counterModel.getCount());

    }

    @Override
    public void decrement() {
        counterModel.decrement();
        counterView.UpdateCounter(counterModel.getCount());
    }


    @Override
    public void attachView(CounterContracts.CounterView counterView) {
        this.counterView = counterView;
    }
    @Override
    public void sendMessage() {
        counterView.showMessage(counterModel.getMessage());
    }
}
