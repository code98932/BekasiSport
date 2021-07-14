package com.example.bekasisport.Comunity.Badminton;

import com.example.bekasisport.Comunity.Basket.Basket;
import com.example.bekasisport.R;

import java.util.ArrayList;
import java.util.Collection;

public class BadmintonData {

    private static final String[] badmintonName = {
            "Perumnas Badminton Club",
            "Altius Badminton CLub",
            "lapaksports",
            "Dian Jaya Badminton Gor",
            "Gor Badminton Olympus",
            "Kombad Bekasi"




    };

    private static final String[] badmintonDetail = {
            "Ayo bermain badminton bersama warga lapangan sekitar, setiap pertandingan dan latihan akan diadakan setiap paginya.",
            "Ayo bermain badminton bersama warga lapangan sekitar, setiap pertandingan dan latihan akan diadakan setiap paginya.",
            "Ayo bermain badminton bersama warga lapangan sekitar, setiap pertandingan dan latihan akan diadakan setiap paginya.",
            "Ayo bermain badminton bersama warga lapangan sekitar, setiap pertandingan dan latihan akan diadakan setiap paginya.",
            "Ayo bermain badminton bersama warga lapangan sekitar, setiap pertandingan dan latihan akan diadakan setiap paginya.",
            "Ayo bermain badminton bersama warga lapangan sekitar, setiap pertandingan dan latihan akan diadakan setiap paginya.",


    };

    private static final int[] badmintonImage= {
            R.drawable.badminton,
            R.drawable.photo,
            R.drawable.photo2,
            R.drawable.e,
            R.drawable.t,
            R.drawable.y







    };

    public static Collection<? extends Badminton> getListData(){
        ArrayList<Badminton> list= new ArrayList<>();
        for(int position = 0; position <badmintonName.length;position++){
            Badminton nama = new Badminton();
            nama.setName(badmintonName[position]);
            nama.setDetail(badmintonDetail[position]);
            nama.setPhoto(badmintonImage[position]);

            list.add(nama);
        }
        return list;

    }

}


