package com.example.bekasisport.Comunity.cycling;

import com.example.bekasisport.R;
import java.util.ArrayList;
import java.util.Collection;

public class CyclingData {

    private static final String[] cyclingName = {
            "bekasigowes",
            "GOWESYUK BEKASI",
            ""
    };

    private static final String[] cyclingDetail = {
            "Ayo bermain Bersepeda bersama warga lapangan sekitar, setiap pertandingan dan latihan akan diadakan setiap paginya.",
            "Ayo bermain Bersepeda bersama warga lapangan sekitar, setiap pertandingan dan latihan akan diadakan setiap paginya.",
            "Ayo bermain Bersepeda bersama warga lapangan sekitar, setiap pertandingan dan latihan akan diadakan setiap paginya.",
            "Ayo bermain Bersepeda bersama warga lapangan sekitar, setiap pertandingan dan latihan akan diadakan setiap paginya.",
            "Ayo bermain Bersepeda bersama warga lapangan sekitar, setiap pertandingan dan latihan akan diadakan setiap paginya.",
            "Ayo bermain Bersepeda bersama warga lapangan sekitar, setiap pertandingan dan latihan akan diadakan setiap paginya.",

    };

    private static final int[] cyclingImage= {
            R.drawable.p,
            R.drawable.a,


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


