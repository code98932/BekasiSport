
package com.example.bekasisport.Comunity.Badminton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.bekasisport.Comunity.Basket.Basket;
import com.example.bekasisport.Comunity.Basket.BasketData;
import com.example.bekasisport.Comunity.Basket.ListBasket;
import com.example.bekasisport.R;

import java.util.ArrayList;

public class BadmintonActivity extends AppCompatActivity {
    private RecyclerView rvBadminton;
    private ArrayList<Badminton> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badminton);

        rvBadminton = findViewById(R.id.rv_badminton);
        rvBadminton.setHasFixedSize(true);

        list.addAll(BadmintonData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {

        rvBadminton.setLayoutManager(new LinearLayoutManager(this));
        ListBadminton listBadminton = new ListBadminton(list);
        rvBadminton.setAdapter(listBadminton);

    }
}
