package com.example.egaradmin.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.egaradmin.databinding.ItemCommentBinding;
import com.example.egaradmin.databinding.ItemPager1Binding;
import com.example.egaradmin.models.DataPager;

import java.util.List;

public class PagerAdapter extends RecyclerView.Adapter<PagerAdapter.PagerViewHolder> {

    private List<DataPager> dataPagerList;

    public PagerAdapter(List<DataPager> dataPagerList) {
        this.dataPagerList = dataPagerList;
    }

    @NonNull
    @Override
    public PagerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemPager1Binding binding=ItemPager1Binding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new PagerViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull PagerViewHolder holder, int position) {
        holder.savaData(dataPagerList.get(position));
    }

    @Override
    public int getItemCount() {
        return dataPagerList.size();
    }

    class PagerViewHolder extends RecyclerView.ViewHolder {

        ItemPager1Binding binding;

        public PagerViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ItemPager1Binding.bind(itemView);

        }
        private void savaData(DataPager dataPager){
            binding.img.setImageResource(dataPager.getImage());
            binding.tvTitle.setText(dataPager.getTitle());
        }

    }
}





