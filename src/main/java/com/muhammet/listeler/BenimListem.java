package com.muhammet.listeler;

import java.util.List;

public class BenimListem<T> {
    private T[] myList;
    private int size;
    public void ekle(T t){
        size++;
    }
    public void sil(T t){

    }
    public void sil(int index){

    }

    public T[] getir(int index){
        return myList;
    }

}
