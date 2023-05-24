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

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }
}
