package com.example.hw4_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw4_3.databinding.FragmentContinentBinding;

import java.util.ArrayList;

public class ContinentFragment extends Fragment {
            private FragmentContinentBinding binding;

            private ArrayList<Continent> continents= new ArrayList<>();
            private ContinentViewAdapter continentViewAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        continentViewAdapter=new ContinentViewAdapter(continents);
        binding.rvContinents.setAdapter(continentViewAdapter);
    }

    private void loadData() {
   continents.add(new Continent("Евразия","https://sp-ao.shortpixel.ai/client/to_auto,q_glossy,ret_img,w_600,h_350/https://shkolnaiapora.ru/wp-content/uploads/2020/07/%D0%95%D0%B2%D1%80%D0%B0%D0%B7%D0%B8%D1%8F.jpg"));
   continents.add(new Continent("Северная Америка",""));
   continents.add(new Continent("Южная Америка",""));
   continents.add(new Continent("Африка",""));
   continents.add(new Continent("Австралия",""));
   continents.add(new Continent("Антарктида",""));
    }
}