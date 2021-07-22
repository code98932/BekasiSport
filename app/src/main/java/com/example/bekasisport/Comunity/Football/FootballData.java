package com.example.bekasisport.Comunity.Football;

import com.example.bekasisport.R;
import java.util.ArrayList;
import java.util.Collection;

public class FootballData {


    private static final String[] footballName = {
            "Persipasi Bekasi",
            "MBSB",
            "ASPEK FC",
            "Sakisega",
            "ABA FC"





    };

    private static final String[] footballDetail = {
            "Persikasi adalah singkatan dari Persatuan Sepak Bola Indonesia Kabupaten Bekasi . Persikasi Bekasi adalah klub sepak bola Indonesia yang berbasis di Kabupaten Bekasi, Jawa Barat.",
            "KALAH MENANG SUDAH BIASA PERSAHABATAN LUAR BIASA",
            "Jaga sportifitas dan menjalin silaturahmi",

            "official sakisega\n" +
                    "open sparing\n" +
                    "silaturahmi bareng\n" +
                    "football dan futsal\n",

            "Football for friendship\n" +
                    "Kp.Cibitung Babakan Kelurahan Telaga Asih Kecamatan Cikarang Barat Kabupaten Bekasi"





    };

    private static final int[] footballImage= {
            R.drawable.k,
            R.drawable.zacky,
            R.drawable.dede,
            R.drawable.wq,
            R.drawable.we



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

