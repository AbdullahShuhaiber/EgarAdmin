package com.example.egaradmin.adapters;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.egaradmin.databinding.ItemCommentBinding;

public class CommentsViewHolder extends RecyclerView.ViewHolder {

    ItemCommentBinding binding;
    public CommentsViewHolder(@NonNull View itemView) {
        super(itemView);
        binding=ItemCommentBinding.bind(itemView);

    }

    public void savaData(){

    }
}
