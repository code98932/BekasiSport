package com.example.bekasisport.News;

import com.example.bekasisport.R;

import java.util.ArrayList;
import java.util.Collection;

public class NewsData {

    private static String[] NewsDetail = {
            "Test"
    };


    private static int[] HotelImage = {
            R.drawable.test
    };


    public static Collection<? extends News> getListData() {
        ArrayList<News> list= new ArrayList<>();
        for (int position = 0; position < NewsDetail.length;position++) {
            News Nama = new News();
            Nama.setDetail(NewsDetail[position]);
            Nama.setPhoto(HotelImage[position]);




            list.add(Nama);
        }
        return list;



    }
}
