package com.muhammet.dil;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        int secim =0;
        IDil dil = null;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("******************");
            System.out.println("** DİL SEÇİNİZ ***");
            System.out.println("******************");
            System.out.println("1. Türkçe");
            System.out.println("2. İngilizce");
            System.out.println("3. Almanca");

            System.out.print("Seçiniz....: ");
            secim = scanner.nextInt();
            switch (secim){
                case 1:
                    dil = new Turkce();break;
                case 2:
                    dil = new Ingilizce();break;
                case 3:
                    dil = new Almanca();break;
            }
            System.out.println(dil.getMesaj());
        }while (secim!=0);
        System.out.println("UYGULAMA KAPANDI");
    }
}
