package com.example.bekasisport.Comunity.Basket;

import com.example.bekasisport.R;

import java.util.ArrayList;
import java.util.Collection;

public class BasketData {

    private static final String[] basketName = {
            "Fortius BasketBall Club Bekasi",
            "PLaYHouR Basketball Club",
            "Indonesia Muda Bola Basket",
            "Lazar Basketball",
            "Hobi basket Bekasi",
            "Family Basketball Bekasi"
    };

    private static final String[] basketDetail = {
            "Ayo bermain Basket bersama warga lapangan sekitar, setiap pertandingan dan latihan akan diadakan setiap paginya.",
            "Ayo bermain Basket bersama warga lapangan sekitar, setiap pertandingan dan latihan akan diadakan setiap paginya.",
            "Ayo bermain Basket bersama warga lapangan sekitar, setiap pertandingan dan latihan akan diadakan setiap paginya.",
            "Ayo bermain Basket bersama warga lapangan sekitar, setiap pertandingan dan latihan akan diadakan setiap paginya.",
            "Ayo bermain Basket bersama warga lapangan sekitar, setiap pertandingan dan latihan akan diadakan setiap paginya.",
            "Ayo bermain Basket bersama warga lapangan sekitar, setiap pertandingan dan latihan akan diadakan setiap paginya.",

    };

    private static final int[] basketImage= {
            R.drawable.q,
            R.drawable.w,
            R.drawable.z,
            R.drawable.x,
            R.drawable.m,
            R.drawable.b




    };

    public static Collection<? extends Basket> getListData(){
        ArrayList<Basket> list= new ArrayList<>();
        for(int position = 0; position <basketName.length;position++){
            Basket nama = new Basket();
            nama.setName(basketName[position]);
            nama.setDetail(basketDetail[position]);
            nama.setPhoto(basketImage[position]);

            list.add(nama);
        }
        return list;

    }

}
