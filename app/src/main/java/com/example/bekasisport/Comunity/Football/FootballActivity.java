package com.example.bekasisport.Comunity.Football;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import com.example.bekasisport.R;

import java.util.ArrayList;

public class FootballActivity extends AppCompatActivity {
    private RecyclerView rvFootball;
    private final ArrayList<Football> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football);

        rvFootball = findViewById(R.id.rv_football);
        rvFootball.setHasFixedSize(true);

        list.addAll(FootballData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {

        rvFootball.setLayoutManager(new LinearLayoutManager(this));
        ListFootball listFootball = new ListFootball(list);
        rvFootball.setAdapter(listFootball);

    }
}
