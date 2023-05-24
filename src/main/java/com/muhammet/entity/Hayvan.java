package com.muhammet.entity;

public class Hayvan {
    /**
     * Hayavana ait açlık durumunu belirtir.
     * true ise aç, false ise tok.
     */
    private boolean acMi;
    public Hayvan(){
        acMi = true;
    }

    public void doyur(){
        acMi = false;
    }

    public String acMisin(){
//        if(acMi)
//            return "Açım";
//        else
//            return "Tokum";
        return acMi ? "Açım" : "Tokum";
    }

}
