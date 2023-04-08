package com.example.egaradmin.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.egaradmin.databinding.ItemCommentBinding;


public class commentsAdapter extends RecyclerView.Adapter<CommentsViewHolder> {



    @NonNull
    @Override
    public CommentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemCommentBinding binding=ItemCommentBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new CommentsViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull CommentsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
