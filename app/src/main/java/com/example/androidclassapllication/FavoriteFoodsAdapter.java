package com.example.androidclassapllication;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FavoriteFoodsAdapter extends RecyclerView.Adapter<FavoriteFoodsAdapter.ListItemHolder> {

    ArrayList<FavoriteFoods> favoriteFoodsArrayList = new ArrayList();

    public FavoriteFoodsAdapter(ArrayList<FavoriteFoods> favoriteFoodsArrayList) {
        this.favoriteFoodsArrayList = favoriteFoodsArrayList;
    }

    @NonNull
    @Override
    public ListItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_item,parent,false);
        return new ListItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListItemHolder holder, int position) {

        holder.txtFoodName.setText(favoriteFoodsArrayList.get(position).foodName);
        holder.imgFoodImage.setImageResource(favoriteFoodsArrayList.get(position).getFoodImage());
        holder.txtPrice.setText(String.valueOf(favoriteFoodsArrayList.get(position).price));
        holder.txtFoodDesc.setText(favoriteFoodsArrayList.get(position).foodDesc);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( holder.itemView.getContext(),FoodDetailActivity.class);
                intent.putExtra("image",favoriteFoodsArrayList.get(position).foodImage);
                holder.itemView.getContext().startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return favoriteFoodsArrayList.size();
    }

    //    First Create A ListItemHolder Class and extend RecyclerView.ViewHolder
//    ========================  ListItemHolder Class Begin ==============================
    public  class ListItemHolder extends RecyclerView.ViewHolder {
        TextView txtFoodName,txtFoodDesc,txtPrice;
        ImageView imgFoodImage;

    public ListItemHolder(@NonNull View itemView) {
        super(itemView);
        txtFoodName = itemView.findViewById(R.id.foodName);
        txtFoodDesc = itemView.findViewById(R.id.foodDesc);
        txtPrice = itemView.findViewById(R.id.price);
        imgFoodImage = itemView.findViewById(R.id.foodImage);


    }

}
    //    ========================  ListItemHolder Class End ==============================



}
