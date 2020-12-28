package com.example.gifdisplay.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.gifdisplay.R;
import com.example.gifdisplay.model.AllDatas;
import com.example.gifdisplay.utility.OnClickAdapter;

public class MyDisplayAdapter extends PagedListAdapter<AllDatas, MyDisplayAdapter.MyViewHolder> {


    private static final DiffUtil.ItemCallback<AllDatas> DIFF_CALLBACK =
            new DiffUtil.ItemCallback<AllDatas>() {
                @Override
                public boolean areItemsTheSame(AllDatas oldItem, AllDatas newItem) {
                    return oldItem.getId() == newItem.getId();
                }

                @Override
                public boolean areContentsTheSame(AllDatas oldItem, AllDatas newItem) {
                    return oldItem.getId().equals(newItem.getId());
                }
            };
    Context context;
    OnClickAdapter onClickAdapter;

    public MyDisplayAdapter(Context context, OnClickAdapter onClickAdapter) {
        super(DIFF_CALLBACK);
        this.context = context;
        this.onClickAdapter = onClickAdapter;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gif_displayer, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Glide.with(context).load(getItem(position).getImages().getOriginal().getUrl()).into(holder.imageView);
    }


    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.gifDisplayer);
            imageView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            onClickAdapter.clickedRecycler(getItem(getAdapterPosition()).getImages().getOriginal().getUrl());
        }
    }
}
