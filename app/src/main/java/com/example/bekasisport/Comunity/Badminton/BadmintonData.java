package com.example.bekasisport.Comunity.Badminton;

import com.example.bekasisport.Comunity.Basket.Basket;
import com.example.bekasisport.R;

import java.util.ArrayList;
import java.util.Collection;

public class BadmintonData {

    private static String[] badmintonName = {
            "test"
    };

    private static String[] badmintonDetail = {
            "m"
    };

    private static int[] badmintonImage= {
            R.drawable.test

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


