package com.example.bekasisport.Comunity.Football;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bekasisport.Comunity.Basket.Basket;
import com.example.bekasisport.R;

public class DetailFootball extends AppCompatActivity {
    TextView txtName,txtDetail;
    ImageView imgView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_football);

        txtName = findViewById(R.id.textjudulfootball);
        Basket hotel = getIntent().getParcelableExtra("football");
        txtName.setText(hotel.getName());

        txtDetail = findViewById(R.id.penjelasanfootball);
        txtDetail.setText(hotel.getDetail());

        imgView = findViewById(R.id.gambarfootball);
        imgView.setImageResource(hotel.getPhoto());


    }
}
