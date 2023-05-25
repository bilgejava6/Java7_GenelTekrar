package com.muhammet.randomuserme.entity;

import java.io.Serializable;

public class Id implements Serializable {
    public String name;
    public String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
