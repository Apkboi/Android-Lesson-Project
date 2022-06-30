package com.example.androidclassapllication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FoodDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);
       Intent intent = getIntent();
     int image =  intent.getIntExtra("image",0);
//     String text =  intent.getStringExtra("image");
        Log.i("Image returned", String.valueOf(image));
//        Toast.makeText(this,String.valueOf(image),Toast.LENGTH_LONG).show();
        ImageView imageView = findViewById(R.id.detail_image);
        ImageButton btn_increase = findViewById(R.id.btn_increase);
        ImageButton btn_decrease = findViewById(R.id.btn_decrease);
        TextView txt_size = findViewById(R.id.txt_size);

        btn_decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String initPrice = txt_size.getText().toString();
                txt_size.setText(String.valueOf(decrement(Integer.parseInt(initPrice))));

            }
        });
        btn_increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String initPrice = txt_size.getText().toString();
                txt_size.setText(String.valueOf(increment(Integer.parseInt(initPrice))));
            }
        });

        imageView.setImageResource(image);
    }

    int increment(int init_price){


        return  init_price+1;
    }
    int decrement(int init_price){

        if(init_price > 0){
            return  init_price -1;
        }

        return  0;
    }
}