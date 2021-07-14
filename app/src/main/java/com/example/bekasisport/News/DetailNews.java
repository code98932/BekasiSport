package com.example.bekasisport.News;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bekasisport.Comunity.cycling.Cycling;
import com.example.bekasisport.R;

public class DetailNews extends AppCompatActivity {
    TextView txtName, txtDetail;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_news);

        txtName = findViewById(R.id.at);
        News news = getIntent().getParcelableExtra("news");
        txtName.setText(news.getName());

        txtDetail = findViewById(R.id.bt);
        txtDetail.setText(news.getDetail());

        imgView = findViewById(R.id.gt);
        imgView.setImageResource(news.getPhoto());


    }
}