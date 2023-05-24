package com.muhammet.stream;

import com.muhammet.listeler.Musteri;

import java.nio.file.Files;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {

    public static void main(String[] args) {
        Stream<Integer> sayilarStream = Stream.of(1,2,43,3,5,32);
        Stream<Integer> tekStream = Stream.of(1);
        Stream<Integer> bosStream = Stream.empty();
        var list = List.of(1,2,3,4,5,6,7,8,9,10);
        var intsayi = 45;
        // intsayi = "ifade";
        var ifade = "sdfds";
        // ifade = 3434;
        var musteri = new Musteri(",",",","");
        Object o = 4545;
        o = "sdfsdf";
        o = new Musteri("","","");
        Stream<Integer> listStream = list.stream();

       // sayilarStream.forEach(System.out::println);
       // sayilarStream.forEach(System.out::println);
        List<String> isimler = List.of("Muhammet","Ahmet","Mehmet","Ali","Veli");

        /**
         * Sonsuz Streamler
         */
        Stream<Double> sonsuzDoubleUret = Stream.generate(Math::random);
        //sonsuzDoubleUret.forEach(System.out::println);
        Stream<Integer> sosuzDuzenliSayi = Stream.iterate(20, x-> x+3);
        //sosuzDuzenliSayi.forEach(System.out::println);
        Stream<Integer> sonsuzSayi = Stream.iterate(10, x-> x<130,x-> x*2);
       // sonsuzSayi.forEach(System.out::println);


        var dizi = new String[]{"A","z","k","a","i","u","r"};
        var result = "";
        for(String s : dizi) result += s;// Azkaiur
      //  System.out.println(result);

        Stream<String> diziStream = Stream.of("A","z","k","a","i","u","r");
        String birlesitirilmis = diziStream.reduce("",(sonuc,eleman)-> sonuc+eleman);
      //  System.out.println(birlesitirilmis);

        Stream<Integer> sayiii = Stream.of(2,6,3,9);
       // System.out.println(sayiii.reduce(1,(s,e)-> s*e));

        BinaryOperator<Integer> binaryOperator = (a,b) -> a*2 + b/3;
        Stream<Integer> st1 = Stream.empty();
        Stream<Integer> st2 = Stream.of(15);
        Stream<Integer> st4 = Stream.of(15,8);
        Stream<Integer> st5 = Stream.of(15,8,6);

        Stream<Integer> st3 = Stream.of(2,543,456,34,3,3,68,54);
        st1.reduce(binaryOperator).ifPresent(System.out::println); // çıktı olmamalı
        st2.reduce(binaryOperator).ifPresent(System.out::println); // 15
        st4.reduce(binaryOperator).ifPresent(System.out::println); // 32
        st5.reduce(binaryOperator).ifPresent(System.out::println); // 66
        st3.reduce(binaryOperator).ifPresent(System.out::println); // 16954

        /**
         * SET -> tekrarsız kayıt tutar
         * TREE -> ağaç yapısıdır. Sıralıdır.
         */
        Stream<String> isim = Stream.of("m","u","h","a","m","m","e","t","a","l","i");
        TreeSet<String> treeSetIsim = isim.collect(
                TreeSet::new,
                TreeSet::add,
                TreeSet::addAll
        );
        System.out.println(treeSetIsim);

        isim = Stream.of("m","u","h","a","m","m","e","t","a","l","i");
        treeSetIsim = isim.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(treeSetIsim);

        /**
         * filter
         */
        Stream<String> isimlerStream =
                Stream.of("Muhammet","Ahmet","Mehmet","Ali","Veli");
        isimlerStream.filter(name-> name.startsWith("M")).forEach(System.out::println);
        System.out.println("******************");
        isimlerStream =
                Stream.of("Muhammet","Ahmet","Mehmet","Ali","Veli");
        isimlerStream.filter(name-> name.length()>3 && name.length()<6)
//                .forEach(System.out::println);
//                .forEach(name-> System.out.println(name.toUpperCase()));
                .forEach(name->{
                    System.out.print(name.length()+" -> ");
                    System.out.println(name.toUpperCase());
                });
        System.out.println("******************");
        /**
         * DISTINCT -> tekrar eden kayıtları siler
         * DİKKAT!!!!
         * burada tekilleştirilen kayıtlar benzer nesnelerdir. bu nedenle elinizde
         * bir nesne listesi var ise bunun içinde aynı bilgilere sahip farklı referans
         * adresli nesneler olabilir bu nedenle de bu nesnlerler tekilleşmez.
         * -> Musteri nesnesini içinde bulunan bilgilere göre tekilleştirme istenilebilir
         * bunun için bu yapıyı kullanamazsınız.
         */
        isimlerStream =
                Stream.of("Muhammet","Muhammet","Mehmet","Ali","Ali");
        isimlerStream.distinct().forEach(System.out::println);
        System.out.println("******************");

    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor)
    {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }


}
