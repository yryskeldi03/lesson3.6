package com.geek.lesson36;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.geek.lesson36.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private Math math;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        math = new Math();

        binding.btnPlus.setOnClickListener(v -> {
            binding.tvResult.setText(String.valueOf(math.add(Integer.parseInt(binding.etInt1.getText().toString())
                    ,Integer.parseInt(binding.etInt2.getText().toString()))));
        });

        binding.btnMinus.setOnClickListener(v -> {
            binding.tvResult.setText(String.valueOf(math.sub(Integer.parseInt(binding.etInt1.getText().toString())
                    ,Integer.parseInt(binding.etInt2.getText().toString()))));
        });
    }
}