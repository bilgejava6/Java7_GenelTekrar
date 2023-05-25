package com.muhammet.randomuserme.entity;

import java.io.Serializable;

public class Location implements Serializable {
    public Street street;
    public String city;
    public String state;
    public String country;
//    public String postcode;
//    public Coordinates coordinates;
//    public Timezone timezone;


    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
