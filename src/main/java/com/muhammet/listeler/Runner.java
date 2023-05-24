package com.muhammet.listeler;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<String> listem = new ArrayList<>();
        listem.add("Muhammet");
        listem.size();
        BenimListem<String> benimListem = new BenimListem<>();
        benimListem.ekle("Muhammet");


    }
}
