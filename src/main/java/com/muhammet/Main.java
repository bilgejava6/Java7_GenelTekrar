package com.muhammet;

import com.muhammet.entity.Hayvan;
import com.muhammet.entity.Kedi;

public class Main {
    public static void main(String[] args) {

        /**
         * Kedi kedi; -> Değişken tanımı
         *
         * new Kedi(); -> Nesne oluşturma
         * Kedi() -> Default Constructor
         */
        Kedi kedi = new Kedi("Memeli",
                "Ankara", "Beyaz");
        //System.out.println(kedi);
        int sayi = 344;
//
//        kedi.agirligi = "5 kg";
//        kedi.cinsi = "Van";
//        kedi.kuyrukuzunlugu = "15 cm";
//        kedi.renk = "Beyaz";
//        kedi.tur = "Memeli";

        System.out.println("Kedinin cinsi: " + kedi.cinsi);


        Hayvan hayvan = new Hayvan();
        hayvan.doyur();
    }
}