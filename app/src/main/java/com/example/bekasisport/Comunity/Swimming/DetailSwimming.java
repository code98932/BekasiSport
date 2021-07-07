package com.example.bekasisport.Comunity.Swimming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.bekasisport.R;

public class DetailSwimming extends AppCompatActivity {

    TextView txtName,txtDetail;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_swimming);

        txtName = findViewById(R.id.juswim);
        Swimming hotel = getIntent().getParcelableExtra("swim");
        txtName.setText(hotel.getName());

        txtDetail = findViewById(R.id.penswim);
        txtDetail.setText(hotel.getDetail());

        imgView = findViewById(R.id.gswim);
        imgView.setImageResource(hotel.getPhoto());


    }
}
