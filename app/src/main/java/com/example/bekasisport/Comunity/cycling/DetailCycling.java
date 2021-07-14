package com.example.bekasisport.Comunity.cycling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bekasisport.Comunity.Basket.Basket;
import com.example.bekasisport.R;

public class DetailCycling extends AppCompatActivity {
    TextView txtName,txtDetail;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_cycling);

        txtName = findViewById(R.id.textjudulcycling);
        Cycling cycling = getIntent().getParcelableExtra("cycling");
        txtName.setText(cycling.getName());

        txtDetail = findViewById(R.id.penjelasancycling);
        txtDetail.setText(cycling.getDetail());

        imgView = findViewById(R.id.gambarcycling);
        imgView.setImageResource(cycling.getPhoto());


    }
}

