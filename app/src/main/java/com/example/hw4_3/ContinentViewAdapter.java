package com.example.hw4_3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ContinentViewAdapter extends RecyclerView.Adapter<ContinentViewAdapter.ContinentHolder> {
        ArrayList<Continent> continents;

    public ContinentViewAdapter(ArrayList<Continent> continents) {
        this.continents = continents;
    }

    @NonNull
    @Override
    public ContinentHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentHolder holder, int position) {
    holder.bind(continents.get(position));
    }

    @Override
    public int getItemCount() {
        return continents.size();
    }

    public class ContinentHolder extends RecyclerView.ViewHolder {
        private ImageView imgContinent;
        private TextView tvContinent;
        public ContinentHolder(@NonNull View itemView) {
            super(itemView);

            imgContinent=itemView.findViewById(R.id.img_continent);
            tvContinent=itemView.findViewById(R.id.tv_Continent);
        }

       public void bind(Continent continent){
            tvContinent.setText(continent.getName());
           Glide.with(imgContinent).load(continent.getIcon()).into(imgContinent);
       }
    }
}

