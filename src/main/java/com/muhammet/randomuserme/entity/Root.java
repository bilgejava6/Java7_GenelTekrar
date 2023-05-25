package com.muhammet.randomuserme.entity;

import java.io.Serializable;
import java.util.ArrayList;


public class Root implements Serializable {
    public ArrayList<Result> results;
    public Info info;

    public ArrayList<Result> getResults() {
        return results;
    }

    public void setResults(ArrayList<Result> results) {
        this.results = results;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }
}
