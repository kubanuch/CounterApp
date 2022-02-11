package com.example.counterapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.CounterContracts;
import com.CounterPresenter;
import com.Injector;
import com.example.counterapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements CounterContracts.CounterView{
    ActivityMainBinding binding;
    CounterPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        presenter = Injector.attachPresenter();
        presenter.attachView(this);
        initListeners();
    }

    private void initListeners() {
        binding.incrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.increment();
                presenter.sendMessage();

            }
        });
        binding.decrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.decrement();
                presenter.sendMessage();
            }
        });
        binding.messageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.decrement();
                presenter.sendMessage();
            }
        });
    }

    @Override
    public void updateCounter(int count) {
        binding.numberTv.setText(String.valueOf(count));
    }

    @Override
    public void greenText() {
        binding.numberTv.setTextColor(Color.parseColor("#07E510"));

    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}