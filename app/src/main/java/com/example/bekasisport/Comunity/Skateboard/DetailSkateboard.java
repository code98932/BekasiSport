package com.example.bekasisport.Comunity.Skateboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.bekasisport.R;

public class DetailSkateboard extends AppCompatActivity {

    TextView txtName,txtDetail;
    ImageView imgView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_skateboard);

        txtName = findViewById(R.id.textjudulskateboard);
        Skateboard hotel = getIntent().getParcelableExtra("skateboard");
        txtName.setText(hotel.getName());

        txtDetail = findViewById(R.id.penjelasanskateboard);
        txtDetail.setText(hotel.getDetail());

        imgView = findViewById(R.id.gambarskateboard);
        imgView.setImageResource(hotel.getPhoto());


    }
}
