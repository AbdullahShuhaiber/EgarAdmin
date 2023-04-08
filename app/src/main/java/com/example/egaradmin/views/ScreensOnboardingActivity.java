package com.example.egaradmin.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.egaradmin.R;
import com.example.egaradmin.adapters.PagerAdapter;
import com.example.egaradmin.databinding.ActivityScreensOnboardingBinding;
import com.example.egaradmin.models.DataPager;

import java.util.ArrayList;
import java.util.List;

public class ScreensOnboardingActivity extends AppCompatActivity {
    ActivityScreensOnboardingBinding binding;
    private PagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityScreensOnboardingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        setOnboardingItems();
//

    }

    private void setOnboardingItems(){
        List<DataPager> dataPagerList=new ArrayList<>();
        dataPagerList.add(new DataPager(R.drawable.pager_1,"111111111111"));
        dataPagerList.add(new DataPager(R.drawable.pager_2,"2222222222222"));
        dataPagerList.add(new DataPager(R.drawable.pager_3,"3333333333333"));

//        DataPager dataPager=new DataPager();
//        dataPager.setImage(R.drawable.pager_1);
//        dataPager.setTitle("");

        adapter =new PagerAdapter(dataPagerList);
        binding.pager.setAdapter(adapter);
    }
}