package com.example.bekasisport.Comunity.cycling;

import com.example.bekasisport.Comunity.Basket.Basket;
import com.example.bekasisport.R;

import java.util.ArrayList;
import java.util.Collection;

public class CyclingData {

    private static String[] cyclingName = {
            "test"
    };

    private static String[] cyclingDetail = {
            "me"
    };

    private static int[] cyclingImage= {
            R.drawable.test

    };

    public static Collection<? extends Cycling> getListData(){
        ArrayList<Cycling> list= new ArrayList<>();
        for(int position = 0; position <cyclingName.length;position++){
            Cycling nama = new Cycling();
            nama.setName(cyclingName [position]);
            nama.setDetail(cyclingDetail[position]);
            nama.setPhoto(cyclingImage[position]);

            list.add(nama);
        }
        return list;

    }

}


