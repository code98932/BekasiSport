package com.example.bekasisport.Comunity.Swimming;

import com.example.bekasisport.R;

import java.util.ArrayList;
import java.util.Collection;

public class SwimmingData {

    private static final String[] swimName = {
            "Kolam renang Sarang Walet",
            "Kolam Renang Indoor",
            "Go Splash Panjibuwono"

    };

    private static final String[] swimDetail = {
            "Kolam renang sarang walet adalah tempat rekreasi untuk keluarga dengan suasana yang nyaman, bersih, dan murah.",
            "Indoor waterpark pertama di Indonesia dibangun tahun 2013 adalah tempat rekreasi yang sangat cocok untuk anak-anak. Didesain dengan konsep ala pertunjukan sirkus, Waterboom ini juga melindungi anak-anak dari kepanasan dan kehujanan, ada kolam air panas, lantai dari rubber yang safety dan nyaman. Ada fasilitas sauna dan Mom n Baby Spa membuat Sirkus Waterplay menjadi tempat favorite bagi keluarga",


    };

    private static final int[] swimImage= {
            R.drawable.zx,
            R.drawable.vc,
            R.drawable.cb

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

