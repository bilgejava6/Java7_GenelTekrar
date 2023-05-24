package com.muhammet;

import com.muhammet.entity.Islemler;

public class RunnerIslemler {

    public static void main(String[] args) {
        Islemler islemler = new Islemler();
        islemler.nakit = 6_000d;
        //islemler.harcanan = 300d;
       // islemler.nakit = 5_700d;
       double harcanan_tutar = islemler.ufaklik_Benim_Verdigim_Kadar_Harcama_Yap_Hesapver(2_250d);

        System.out.println("harcanan_tutar: " + harcanan_tutar);
        System.out.println("islemler.nakit: " + islemler.nakit);

    }
}
