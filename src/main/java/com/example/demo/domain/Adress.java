package com.example.demo.domain;

public class Adress {

    private String city;
    private String country;

    protected Adress() {

    }

    public Adress(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
