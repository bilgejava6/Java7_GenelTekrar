package com.muhammet.entity;

public class Arac {
    public int id;
    public String plaka;

    public Arac(){
        System.out.println("Burayayım Arac Sınıfı");
    }

    public Arac(int id, String plaka) {
        this.id = id;
        this.plaka = plaka;
        System.out.println("Parametreli Constructor");
    }

}
