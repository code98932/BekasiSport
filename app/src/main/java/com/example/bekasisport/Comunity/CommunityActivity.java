package com.example.bekasisport.Comunity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.bekasisport.Comunity.Badminton.BadmintonActivity;
import com.example.bekasisport.Comunity.Basket.BasketActivity;
import com.example.bekasisport.Comunity.Football.FootballActivity;
import com.example.bekasisport.Comunity.Skateboard.SkateboardActivity;
import com.example.bekasisport.Comunity.Swimming.SwimmingActivity;
import com.example.bekasisport.Comunity.cycling.CyclingActivity;
import com.example.bekasisport.R;


public class CommunityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);

        Button btnBadminton = findViewById(R.id.badmintonA);
        btnBadminton.setOnClickListener(v -> {
            Intent intent = new Intent(CommunityActivity.this, BadmintonActivity.class);
            startActivity(intent);
        });

        Button btnBasket = findViewById(R.id.basketA);
        btnBasket.setOnClickListener(v -> {
            Intent intent = new Intent(CommunityActivity.this, BasketActivity.class);
            startActivity(intent);
        });

        Button btnSkateBoard = findViewById(R.id.skateboardA);
        btnSkateBoard.setOnClickListener(v -> {
            Intent intent = new Intent(CommunityActivity.this, SkateboardActivity.class);
            startActivity(intent);
        });

        Button btnSwimming = findViewById(R.id.swimmingA);
        btnSwimming.setOnClickListener(v -> {
            Intent intent = new Intent(CommunityActivity.this, SwimmingActivity.class);
            startActivity(intent);
        });

        Button btnCycling = findViewById(R.id.cyclingA);
        btnCycling.setOnClickListener(v -> {
            Intent intent = new Intent(CommunityActivity.this, CyclingActivity.class);
            startActivity(intent);
        });

        Button btnFootball = findViewById(R.id.footballA);
        btnFootball.setOnClickListener(v -> {
            Intent intent = new Intent(CommunityActivity.this, FootballActivity.class);
            startActivity(intent);
        });

    }
}