package com.example.bekasisport.Comunity.Swimming;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import com.example.bekasisport.R;

import java.util.ArrayList;

public class SwimmingActivity extends AppCompatActivity {
    private RecyclerView rvSwim;
    private final ArrayList<Swimming> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swimming);

        rvSwim = findViewById(R.id.rv_swim);
        rvSwim.setHasFixedSize(true);

        list.addAll(SwimmingData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {

        rvSwim.setLayoutManager(new LinearLayoutManager(this));
        ListSwimming listSkateboard = new ListSwimming(list);
        rvSwim.setAdapter(listSkateboard);

    }
}