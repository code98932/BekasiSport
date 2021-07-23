package com.example.bekasisport.Comunity.Skateboard;

import com.example.bekasisport.R;

import java.util.ArrayList;
import java.util.Collection;

public class SkateboardData {

    private static final String[] skateName = {
            "Tugu Skatepark & Skateshop",
            "homiesskateshop",
            "TSP Skateshop"


    };

    private static final String[] skateDetail = {
            "Tugu Skatepark & Skateshop berlokasi di jalan Kemandoran, Pekayon Jaya, Bekasi Selatan. Tempat kami menjual berbagai peralatan Skateboard dan appreal skateboard. Selain itu juga tersedia arena bermain skateboard yang nyaman. Kami juga menyediakan instruktur bagi yang ingin bermain skateboard. Tempat yang nyamam, Pelayanan yang ramah profesional bisa anda dapatkan di tempat kami. Silahkan hubungi kami untuk info lebih lanjut.",
            "kami menjual berbagai macam papan skate ada juga yang full set,serta juga kami menjual berbagai macam merchendise,seperti T-shirt,jacket hoodie,sneakers,snapback dan onderdil skate.#LOLAMAGUETINGGAL",
            "Ayo bermain skateboard bersama warga lapangan sekitar, setiap pertandingan dan latihan akan diadakan setiap paginya.",

    };

    private static final int[] skateImage= {
            R.drawable.sd,
            R.drawable.xc,
            R.drawable.bn


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


