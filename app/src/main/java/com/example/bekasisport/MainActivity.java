package com.example.bekasisport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bekasisport.Comunity.CommunityActivity;

public class MainActivity extends AppCompatActivity {
    private Button buttonNewsPage;
    private Button buttonCommunityPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonNewsPage = findViewById(R.id.homeNews);
        buttonNewsPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewsHomePages();
            }


        });

        buttonCommunityPage = findViewById(R.id.homeCommunity);
        buttonCommunityPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCommunityPages();
            }


        });

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