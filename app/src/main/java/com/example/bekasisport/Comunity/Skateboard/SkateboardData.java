package com.example.bekasisport.Comunity.Skateboard;

import com.example.bekasisport.R;

import java.util.ArrayList;
import java.util.Collection;

public class SkateboardData {

    private static final String[] skateName = {
            "test"
    };

    private static final String[] skateDetail = {
            "meong"
    };

    private static final int[] skateImage= {
            R.drawable.test

    };

    public static Collection<? extends Skateboard> getListData(){
        ArrayList<Skateboard> list= new ArrayList<>();
        for(int position = 0; position <skateName.length;position++){
            Skateboard nama = new Skateboard();
            nama.setName(skateName [position]);
            nama.setDetail(skateDetail[position]);
            nama.setPhoto(skateImage[position]);

            list.add(nama);
        }
        return list;

    }

}


