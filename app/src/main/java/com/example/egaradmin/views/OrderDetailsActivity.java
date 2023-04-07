package com.example.egaradmin.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.egaradmin.databinding.ActivityOrderDetailsBinding;

public class OrderDetailsActivity extends AppCompatActivity {
    ActivityOrderDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityOrderDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}