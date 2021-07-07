package com.example.bekasisport.Comunity.Swimming;

import com.example.bekasisport.R;

import java.util.ArrayList;
import java.util.Collection;

public class SwimmingData {

    private static final String[] swimName = {
            "test"
    };

    private static final String[] swimDetail = {
            "keong"
    };

    private static final int[] swimImage= {
            R.drawable.test

    };

    public static Collection<? extends Swimming> getListData(){
        ArrayList<Swimming> list= new ArrayList<>();
        for(int position = 0; position <swimName.length;position++){
            Swimming nama = new Swimming();
            nama.setName(swimName [position]);
            nama.setDetail(swimDetail[position]);
            nama.setPhoto(swimImage[position]);

            list.add(nama);
        }
        return list;

    }

}

