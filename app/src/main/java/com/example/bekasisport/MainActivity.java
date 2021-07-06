package com.example.bekasisport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;import android.widget.Button;

import com.example.bekasisport.Comunity.CommunityActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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