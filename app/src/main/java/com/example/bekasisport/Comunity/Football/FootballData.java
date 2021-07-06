package com.example.bekasisport.Comunity.Football;

import com.example.bekasisport.R;
import java.util.ArrayList;
import java.util.Collection;

public class FootballData {


    private static final String[] footballName = {
            "test"
    };

    private static final String[] footballDetail = {
            "meong"
    };

    private static final int[] footballImage= {
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

