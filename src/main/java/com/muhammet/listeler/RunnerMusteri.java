package com.muhammet.listeler;

import java.util.*;
import java.util.stream.Collectors;

public class RunnerMusteri {
    //private static
//    private static List<Musteri> musteriler = Arrays.asList(
//            new Musteri("Muhammet","Karakaya","İstanbul"),
//            new Musteri("Ahmet","Karakaya","Ankara"),
//            new Musteri("Demet","Karakaya","İzmir"),
//            new Musteri("Turan","Karakaya","Bolu"),
//            new Musteri("Kenan","Karakaya","İstanbul"),
//            new Musteri("Bahar","Karakaya","Samsun"),
//            new Musteri("Emel","Karakaya","İstanbul"),
//            new Musteri("Esin","Karakaya","Hatay"),
//            new Musteri("Tuğba","Karakaya","İzmir"),
//            new Musteri("Nuran","Karakaya","Bolu"),
//            new Musteri("Canan","Karakaya","İstanbul")
//            );
    public static void main(String[] args) {
        /**
         * Müşteri bilgileri sürekli güncellenebilecek bilgilerdir. bu nedenle
         * her müşteri bilgisinin db den güncel hali ile çekilmesi zorunludur.
         * 1. Yöntem -> her seferinde DB ye gidip kişi bilgisi çekmek
         * ---> Bu işlem çok yüksek gecikmelere neden olacağı için yüksek
         *      tekrarlı sorgularda sorun çıkartır.
         * 2. Yöntem -> DB den gerekli bilgileri çekip bir listeye atmak
         * ---> Bu işlem bizim için düşük liste sayılarında sorun çıkartmaz.(1-1m arası)
         */
        List<Musteri> musteriler = new ArrayList<>();
        musteriler.add(new Musteri("Emel","Karakaya","İstanbul"));
        for (int i=0;i<10_000_000;i++)
            musteriler.add(new Musteri("Canan"+i,"Karakaya","İstanbul"));
        Long start = System.currentTimeMillis(); // şuanın milisaniye cinsinden değeri alır.
        Musteri musteri;
        for (int i =0; i< 600;i++){
            musteri = musteriler.stream().filter(m-> m.ad.equals("Emel")).findFirst().get();
        }
        Long end = System.currentTimeMillis();
        System.out.println("Geçen süre List...:  "+(end-start)); // 21 milisaniye, 777 , 5.064

        start = System.currentTimeMillis(); // şuanın milisaniye cinsinden değeri alır.

//        HashMap<String,Musteri> musteriMap = musteriler.stream()
//                .collect(Collectors.toMap(m->m.ad,m->m,(e1, e2) -> e2,HashMap::new));
        Map<String,Musteri> musteriMap = musteriler.stream()
                .collect(Collectors.toMap(m->m.ad,m->m));
        end = System.currentTimeMillis();
        System.out.println("Geçen süre map oluşturma...: "+(end-start)); //
        for (int i =0; i< 600;i++){
            musteri = musteriMap.get("Emel");
        }
        end = System.currentTimeMillis();
        System.out.println("Geçen süre map...: "+(end-start)); // 21 milisaniye, 777 , 5.064




//        musteriler.stream().filter(musteri->musteri.sehir.equals("İstanbul")).forEach(System.out::println);
 //System.out.println(musteriler.get(4).sehir);
//        musteriler.forEach(musteri->{
//            System.out.println(musteri.ad+" "+musteri.soyad);
//        });
    }
}
