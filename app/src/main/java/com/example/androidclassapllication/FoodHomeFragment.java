package com.example.androidclassapllication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class FoodHomeFragment extends Fragment {



    public FoodHomeFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view  = inflater.inflate(R.layout.fragment_food_home, container, false);

        ArrayList<FavoriteFoods> myFavoriteFoods = new ArrayList<>();
        FavoriteFoodsAdapter favoriteFoodsAdapter = new FavoriteFoodsAdapter(myFavoriteFoods);
        RecyclerView recyclerView =  view.findViewById(R.id.fvoriteRecycler);
        recyclerView.setAdapter(favoriteFoodsAdapter);


        FavoriteFoods firstFavoriteFood = new FavoriteFoods(R.drawable.burger, "pizza", 2500, "yummy");
        FavoriteFoods secondFavoriteFood = new FavoriteFoods(R.drawable.vegetable,"burger",100,"green");
        FavoriteFoods thirdFavoriteFood = new FavoriteFoods(R.drawable.burger,"vegetable",100,"green");
        FavoriteFoods fourthFavoriteFood = new FavoriteFoods(R.drawable.vegetable,"Indomie",100,"green");
        FavoriteFoods fifthFavoriteFood = new FavoriteFoods(R.drawable.burger,"Rice",100,"green");







        myFavoriteFoods.add(firstFavoriteFood);
        myFavoriteFoods.add(secondFavoriteFood);
        myFavoriteFoods.add(thirdFavoriteFood);
        myFavoriteFoods.add(fourthFavoriteFood);
        myFavoriteFoods.add(fifthFavoriteFood);
        return view;
    }
}