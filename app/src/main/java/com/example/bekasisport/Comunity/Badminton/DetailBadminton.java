package com.example.bekasisport.Comunity.Badminton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bekasisport.Comunity.Basket.Basket;
import com.example.bekasisport.R;

public class DetailBadminton extends AppCompatActivity {
    TextView txtName,txtDetail;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_badminton);

        txtName = findViewById(R.id.textjudulbadminton);
        Badminton hotel = getIntent().getParcelableExtra("badminton");
        txtName.setText(hotel.getName());

        txtDetail = findViewById(R.id.penjelasanbadminton);
        txtDetail.setText(hotel.getDetail());

        imgView = findViewById(R.id.gambarbadminton);
        imgView.setImageResource(hotel.getPhoto());
    }
}