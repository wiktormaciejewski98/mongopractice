package com.example.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
public class Hotel {

    @Id
    private String id;
    private String name;
    @Indexed(direction = IndexDirection.ASCENDING)
    private double pricePerNight;
    private Adress adress;
    private List<Review> reviews;

    protected Hotel() {
        this.reviews = new ArrayList<>();
    }

    public Hotel(String name, double pricePerNight, Adress adress, List<Review> reviews) {
        this.name = name;
        this.pricePerNight = pricePerNight;
        this.adress = adress;
        this.reviews = reviews;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Adress getAdress() {
        return adress;
    }

    public List<Review> getReviews() {
        return reviews;
    }
}
