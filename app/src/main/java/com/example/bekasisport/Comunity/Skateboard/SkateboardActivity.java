package com.example.bekasisport.Comunity.Skateboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.bekasisport.R;

import java.util.ArrayList;

public class SkateboardActivity extends AppCompatActivity {
    private RecyclerView rvSkateboard;
    private final ArrayList<Skateboard> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skateboard);

        rvSkateboard = findViewById(R.id.rv_skateboard);
        rvSkateboard.setHasFixedSize(true);

        list.addAll(SkateboardData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {

        rvSkateboard.setLayoutManager(new LinearLayoutManager(this));
        ListSkateboard listSkateboard = new ListSkateboard(list);
        rvSkateboard.setAdapter(listSkateboard);

    }
}