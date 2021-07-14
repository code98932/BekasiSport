package com.example.bekasisport.News;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.bekasisport.R;

import java.util.ArrayList;

public class NewsActivity extends AppCompatActivity {
    private RecyclerView rvNews;
    private ArrayList<News> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        rvNews = findViewById(R.id.rv_news);
        rvNews.setHasFixedSize(true);

        list.addAll(NewsData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {

        rvNews.setLayoutManager(new LinearLayoutManager(this));
        ListNews listNews = new ListNews(list);
        rvNews.setAdapter(listNews);

    }
}