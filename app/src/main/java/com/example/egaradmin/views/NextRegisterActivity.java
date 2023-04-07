package com.example.egaradmin.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.egaradmin.databinding.ActivityNextRegisterBinding;

public class NextRegisterActivity extends AppCompatActivity {
    ActivityNextRegisterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityNextRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}