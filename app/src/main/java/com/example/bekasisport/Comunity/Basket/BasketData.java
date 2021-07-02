package com.example.bekasisport.Comunity.Basket;

import com.example.bekasisport.R;

import java.util.ArrayList;
import java.util.Collection;

public class BasketData {

    private static String[] basketName = {
            "test"
    };

    private static String[] basketDetail = {
            "test"
    };

    private static int[] basketImage= {
            R.drawable.test

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
