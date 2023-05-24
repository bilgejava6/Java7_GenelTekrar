package com.muhammet.listeler;

public class Musteri {
    public String ad;
    public String soyad;
    public String sehir;

    @Override
    public String toString() {
        return "Musteri{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sehir='" + sehir + '\'' +
                '}';
    }

    public Musteri(String ad, String soyad, String sehir){
        this.ad = ad;
        this.soyad = soyad;
        this.sehir = sehir;
    }
}
