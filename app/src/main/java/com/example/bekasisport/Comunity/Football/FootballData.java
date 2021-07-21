package com.example.bekasisport.Comunity.Football;

import com.example.bekasisport.R;
import java.util.ArrayList;
import java.util.Collection;

public class FootballData {


    private static final String[] footballName = {
            "Persikasi",
            "Persipasi Bekasi",
            ""

    };

    private static final String[] footballDetail = {
            "Persikasi adalah singkatan dari Persatuan Sepak Bola Indonesia Kabupaten Bekasi . Persikasi Bekasi adalah klub sepak bola Indonesia yang berbasis di Kabupaten Bekasi, Jawa Barat.",
            "KALAH MENANG SUDAH BIASA PERSAHABATAN LUAR BIASA",



    };

    private static final int[] footballImage= {
            R.drawable.k

    };

    public static Collection<? extends Football> getListData(){
        ArrayList<Football> list= new ArrayList<>();
        for(int position = 0; position <footballName.length;position++){
            Football nama = new Football();
            nama.setName(footballName [position]);
            nama.setDetail(footballDetail[position]);
            nama.setPhoto(footballImage[position]);

            list.add(nama);
        }
        return list;

    }

}

