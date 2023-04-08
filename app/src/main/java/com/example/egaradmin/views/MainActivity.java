package com.example.egaradmin.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.egaradmin.R;
import com.example.egaradmin.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.tab.addTab(binding.tab.newTab().setText("products"));
        binding.tab.addTab(binding.tab.newTab().setText("Requests"));
        binding.tab.addTab(binding.tab.newTab().setText("opinions"));


    }
}