package com.muhammet.randomuserme.entity;

import java.io.Serializable;

public class Result implements Serializable {
    public String gender;
    public Name name;
    public Location location;
    public String email;
 //   public Login login;
  //  public Dob dob;
  //  public Registered registered;
    public String phone;
    public String cell;
    public Id id;

   // public Picture picture;
    public String nat;

    @Override
    public String toString() {
        return "Result{" +
                "gender='" + gender + '\'' +
                ", name=" + name +
                ", location=" + location +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", cell='" + cell + '\'' +
                ", id=" + id +
                ", nat='" + nat + '\'' +
                '}';
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public String getNat() {
        return nat;
    }

    public void setNat(String nat) {
        this.nat = nat;
    }
}
