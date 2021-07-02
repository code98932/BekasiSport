package com.example.bekasisport.Comunity.Basket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.bekasisport.R;

import java.util.ArrayList;

public class BasketActivity extends AppCompatActivity {
    private RecyclerView rvBasket;
    private ArrayList<Basket> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);

        rvBasket = findViewById(R.id.rv_basket);
        rvBasket.setHasFixedSize(true);

        list.addAll(BasketData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {

        rvBasket.setLayoutManager(new LinearLayoutManager(this));
        ListBasket listBasket = new ListBasket(list);
        rvBasket.setAdapter(listBasket);

    }
}