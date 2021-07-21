package com.example.bekasisport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;import android.widget.Button;

import com.example.bekasisport.Comunity.Badminton.BadmintonActivity;
import com.example.bekasisport.Comunity.Basket.Basket;
import com.example.bekasisport.Comunity.Basket.BasketActivity;
import com.example.bekasisport.Comunity.CommunityActivity;
import com.example.bekasisport.Comunity.Football.FootballActivity;
import com.example.bekasisport.Comunity.Skateboard.SkateboardActivity;
import com.example.bekasisport.Comunity.Swimming.SwimmingActivity;
import com.example.bekasisport.News.DetailNews;
import com.example.bekasisport.News.NewsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnnewsa = findViewById(R.id.buttona);
        btnnewsa.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, BadmintonActivity.class);
            startActivity(intent);
        });

        Button btnnewsb = findViewById(R.id.buttonb);
        btnnewsb.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, BasketActivity.class);
            startActivity(intent);
        });

        Button btnnewsc = findViewById(R.id.buttonc);
        btnnewsc.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SwimmingActivity.class);
            startActivity(intent);
        });

        Button btnnewsd = findViewById(R.id.buttond);
        btnnewsd.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FootballActivity.class);
            startActivity(intent);
        });

        Button buttonNewsPage = findViewById(R.id.homeNews);
        buttonNewsPage.setOnClickListener(v -> openNewsHomePages());

        Button buttonCommunityPage = findViewById(R.id.homeCommunity);
        buttonCommunityPage.setOnClickListener(v -> openCommunityPages());

    }

    private void openNewsHomePages() {
        Intent intent = new Intent(this, NewsActivity.class);
        startActivity(intent);
    }

    private void openCommunityPages() {

        Intent intent = new Intent(this, CommunityActivity.class);
        startActivity(intent);
    }


}