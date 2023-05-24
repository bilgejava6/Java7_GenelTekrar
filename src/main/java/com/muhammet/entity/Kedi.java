package com.muhammet.entity;

public class Kedi {
    /**
     * Default Constructor
     * bu sınıfın nesne referansını döner.
     */
    public Kedi(){
        System.out.println("Kedi nesnesi oluşturuldu.");
        tur = "Memeli";
        cinsi = "Van";
        renk = "Beyaz";
        uzunlugu = "50 cm";
        agirligi = "5 kg";
    }

    /**
     * Parametreli Constructor
     */
    public Kedi(String tur, String cinsi, String renk){
        this.tur = tur;
        this.cinsi = cinsi;
        this.renk = renk;
    }



    public String tur;
    public String cinsi;
    public String renk;
    public String uzunlugu;
    public String agirligi;
    public String kuyrukuzunlugu;



}
