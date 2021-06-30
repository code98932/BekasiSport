package com.example.bekasisport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class CommunityActivity extends AppCompatActivity {
    private Button btnBasket;
    private Button btnBadminton;
    private Button btnSkateBoard;
    private Button btnSwimming;
    private Button btnCycling;
    private Button btnFootball;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);

        btnBadminton = findViewById(R.id.badmintonA);
        btnBadminton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CommunityActivity.this, BadmintonActivity.class);
                startActivity(intent);
            }
        });

        btnBasket = findViewById(R.id.basketA);
        btnBasket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CommunityActivity.this, BasketActivity.class);
                startActivity(intent);
            }
        });

        btnSkateBoard = findViewById(R.id.skateboardA);
        btnSkateBoard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CommunityActivity.this, SkateboardActivity.class);
                startActivity(intent);
            }
        });

        btnSwimming = findViewById(R.id.swimmingA);
        btnSwimming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CommunityActivity.this, SwimmingActivity.class);
                startActivity(intent);
            }
        });

        btnCycling = findViewById(R.id.cyclingA);
        btnCycling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CommunityActivity.this, CyclingActivity.class);
                startActivity(intent);
            }
        });

        btnFootball = findViewById(R.id.footballA);
        btnFootball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CommunityActivity.this, FootballActivity.class);
                startActivity(intent);
            }
        });

    }
}