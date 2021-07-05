package com.example.bekasisport.Comunity.Basket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bekasisport.R;

public class DetailBasket extends AppCompatActivity {
    TextView txtName,txtDetail;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_basket);

        txtName = findViewById(R.id.textjudulbasket);
        Basket hotel = getIntent().getParcelableExtra("basket");
        txtName.setText(hotel.getName());

        txtDetail = findViewById(R.id.penjelasanbasket);
        txtDetail.setText(hotel.getDetail());

        imgView = findViewById(R.id.gambarbasket);
        imgView.setImageResource(hotel.getPhoto());


    }
}
