package com.example.bekasisport.News;

import com.example.bekasisport.R;

import java.util.ArrayList;
import java.util.Collection;

public class NewsData {

    private static final String[] NewsJudul = {
            "Persikasi Bekasi Pastikan Tampil di Liga Musim 2018"

    };

    private static String[] NewsDetail = {
            "POJOKJABAR.com, CIKARANG PUSAT – Persikasi Kabupaten Bekasi memastikan diri tampil di Liga 3 regional Jawa Barat musim kompetisi 2018 ini.Berbagai persiapan mulai dari pembentukan tim dan administrasi sudah ditempuh.Jemi Riswana, Wakil Bendahara KONI Kabupaten Bekasi, yang juga dipercaya untuk melakukan pemberkasan tim Persikasi mengatakan, Persikasi sudah terdaftar di Liga 3 Jawa Barat Dirinya, yang dipercaya menyususun persyaratan tiap pemain, untuk selanjutnya diajukan pada Asosiasi Provinsi (Asprov) PSSI Jawa Barat, mengakui bahwa data para pemain sudah masuk, termasuk official tim.Insya allah ikut. Beberapa persyaratan yang harus dilengkapi juga sudah kita siapkan termasuk biaya pendaftaran sebesar Rp 7,5 juta,” kata Jemi Riswana, Kamis (5/4/2018) Pendaftaran Liga 3 Regional Jawa Barat sendiri, kata dia, akan ditutup pada 10 April 2018 mendatang. Sejumlah administrasi, sudah tersusun dan selanjutnya tim akan diberikan program latihan lanjutan, oleh pelatih.Setelah batas akhir pendaftaran nanti, baru ditentukan oleh Asprov PSSI Jawa Barat mana saja tim-tim yang akan ikut serta pembagian groupnya,” kata dia. Kompetisi Liga 3 regional Jawa Barat rencananya akan bergulir pada 29 April 2018 dan akan dihelat di sejumlah daerah di Jawa Barat dengan jumlah calon peserta sebanyak 65 klub.Dibulan ini, ada dua yang akan bertanding. Pertama suratin tanggal 17 dan liga tiga tanggal 29. Keduanya sudah terdaftar,” pungkasnya."

    };


    private static int[] HotelImage = {
            R.drawable.test
    };


    public static Collection<? extends News> getListData() {
        ArrayList<News> list= new ArrayList<>();
        for (int position = 0; position < NewsJudul.length;position++) {
            News Nama = new News();
            Nama.setName(NewsJudul[position]);
            Nama.setDetail(NewsDetail[position]);
            Nama.setPhoto(HotelImage[position]);




            list.add(Nama);
        }
        return list;



    }
}
