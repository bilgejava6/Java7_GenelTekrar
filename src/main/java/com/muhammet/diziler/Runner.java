package com.muhammet.diziler;

public class Runner {

    public static void main(String[] args) {
        // Dizilerde indexler daima 0'dan başlar
        int[] sayilar = {1,2,4,65,74,23};
        int sayi; // değişken tanımlama
        sayi = 5; // değişkene değer atama
        System.out.println(sayi); // değişkeni ekrana yazdırma
        sayilar[4] = 11223; // dizide değer atama
        System.out.println(sayilar[4]); // dizideki değeri ekrana yazdırma
        /**
         *       0    1     2
         *   0  id - ad - telefon
         *   1  1 - Ali - 123456
         *   2  2 - Veli - 123456
         *   3  3 - Ayşe - 123456
         *
         *   0,0 -> 0,1 -> 0,2 -> 1,0 -> 1,1 -> 1,2
         *
         */
        String[][] kisiler = new String[4][3];
        kisiler[0][0] = "id";
        kisiler[0][1] = "ad";
        kisiler[0][2] = "telefon";
        kisiler[1][0] = "1";
        kisiler[1][1] = "Ali";
        kisiler[1][2] = "123456";
        kisiler[2][0] = "2";
        kisiler[2][1] = "Veli";
        kisiler[2][2] = "123456";
        kisiler[3][0] = "3";
        kisiler[3][1] = "Ayşe";
        kisiler[3][2] = "123456";
        System.out.println(kisiler[2][1]);
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                System.out.print(kisiler[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
