package com.muhammet.randomuserme;

import com.google.gson.Gson;
import com.muhammet.randomuserme.entity.Result;
import com.muhammet.randomuserme.entity.Root;

import java.io.*;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /**
         * İlk olarak bir internet sitesinden, Json bilgisini alacağımız
         * adresi belirliyoruz ve oradan tüm bilgileri string olarak alıyoruz.
         */
        Scanner scanner = null;
        try{
            scanner = new Scanner(
                    new URL("https://randomuser.me/api/?results=50").openStream());
        }catch (Exception exception){
            System.out.println("Error: " + exception.getMessage());
        }
        StringBuilder stringBuilder = new StringBuilder();
        while(scanner.hasNext()){
            stringBuilder.append(scanner.nextLine());
        }
        /**
         * Gson kütüphanesini kullanarak, Json bilgisini Root class'ımıza
         * çeviriyoruz.
         */
        Gson gson = new Gson();
        Root root = gson.fromJson(stringBuilder.toString(), Root.class);
        Map<String, List<Result>> countryList =
                root.results.stream().collect(
                        Collectors.groupingBy(x-> x.getLocation().country));

        System.out.println(countryList);
//        root.results
//                .stream().filter(x-> x.getLocation().country.equals("Turkey"))
//                .forEach(x->{
//            System.out.println(x.name);
//        });

        /**
         * Gerekli ise çektiğiniz ve bir sınıf içine attığınız dataları bir dosyaya
         * yazabiliriz.
         */

        String fileName= "Test.txt";
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(root);
        oos.close();

        /**
         * Gerekli olduğuna ise bu bilgileri dosyadan okuyarak sınıfınızın içine aktarabilirsiniz.
         */

        FileInputStream fin = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fin);
        Root fileRoot= (Root) ois.readObject();
        ois.close();


    }
}
