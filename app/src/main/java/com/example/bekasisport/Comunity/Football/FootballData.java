package com.example.bekasisport.Comunity.Football;

import com.example.bekasisport.Comunity.cycling.Cycling;
import com.example.bekasisport.R;

import java.util.ArrayList;
import java.util.Collection;

public class FootballData {


    private static String[] footballName = {
            "test"
    };

    private static String[] footballDetail = {
            "meong"
    };

    private static int[] footballImage= {
            R.drawable.test

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

