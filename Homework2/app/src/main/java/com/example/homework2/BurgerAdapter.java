package com.example.homework2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BurgerAdapter extends RecyclerView.Adapter<BurgerAdapter.BurgerViewHolder> {

    private ArrayList<Burger> burgersToAdapt;

    public void setBurgersToAdapt(ArrayList<Burger> burgersToAdapt) {
        this.burgersToAdapt = burgersToAdapt;
    }

    public static class BurgerViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView nameTextView;
        public ImageView imageImageView;

        public BurgerViewHolder(View v) {
            super(v);
            view = v;
            nameTextView = v.findViewById(R.id.detailBurgerName);
            imageImageView = v.findViewById(R.id.detailBurgerImage);
        }
    }

    @NonNull
    @Override
    public BurgerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.burger, parent, false);

        BurgerViewHolder burgerViewHolder = new BurgerViewHolder(view);
        return burgerViewHolder;


    }

    @Override
    public void onBindViewHolder (@NonNull BurgerViewHolder holder, int position) {
        final Burger burgerAtPosition = burgersToAdapt.get(position);
        holder.view.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, BurgerDetailActivity.class);
                intent.putExtra("BurgerID", burgerAtPosition.getBurgerID());
                context.startActivity(intent);
            }
        });

        holder.nameTextView.setText(burgerAtPosition.getName());
        holder.imageImageView.setImageResource(burgerAtPosition.getImageID());
    }

    @Override
    public int getItemCount() {
        return burgersToAdapt.size();
    }
}
