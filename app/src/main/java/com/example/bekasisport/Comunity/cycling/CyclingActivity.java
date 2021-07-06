package com.example.bekasisport.Comunity.cycling;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.bekasisport.Comunity.Basket.Basket;
import com.example.bekasisport.Comunity.Basket.BasketData;
import com.example.bekasisport.Comunity.Basket.ListBasket;
import com.example.bekasisport.R;

import java.util.ArrayList;

public class CyclingActivity extends AppCompatActivity {
    private RecyclerView rvCycling;
    private ArrayList<Cycling> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cycling);

        rvCycling = findViewById(R.id.rv_cycling);
        rvCycling.setHasFixedSize(true);

        list.addAll(CyclingData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {

        rvCycling.setLayoutManager(new LinearLayoutManager(this));
        ListCycling listCycling = new ListCycling(list);
        rvCycling.setAdapter(listCycling);

    }
}
