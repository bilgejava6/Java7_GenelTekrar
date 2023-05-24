package com.muhammet.entity;

public class Islemler {
    public double nakit;
    public double harcanan;

    public void ufaklik_Harcama_Yap(){
        double harcanan_miktar = 1_500d;
        nakit = nakit - harcanan_miktar;
        harcanan = harcanan + harcanan_miktar;
    }
    public double ufaklik_Harcama_Yap_Hesapver(){
        double harcanan_miktar = 1_500d;
        nakit = nakit - harcanan_miktar;
        harcanan = harcanan + harcanan_miktar;
        /**
         * Log işlemi
         */
        System.out.println("harcana miktar: " + harcanan_miktar);
        System.out.println("nakit: " + nakit);
        System.out.println("harcanan: " + harcanan);
        return harcanan_miktar;
    }

    public double ufaklik_Benim_Verdigim_Kadar_Harcama_Yap_Hesapver(double harcanan_miktar){
        //double harcanan_miktar = 1_500d;
        nakit = nakit - harcanan_miktar;
        harcanan = harcanan + harcanan_miktar;
        /**
         * Log işlemi
         */
        System.out.println("LOG harcana miktar: " + harcanan_miktar);
        System.out.println("LOG nakit: " + nakit);
        System.out.println("LOG harcanan: " + harcanan);
        return harcanan_miktar;
    }



}
