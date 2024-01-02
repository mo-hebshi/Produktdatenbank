package com.NgomaHebshi.Produktdatenbank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id; // Import the Id annotation

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private double price;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price; // Corrected to return price
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) { // Corrected field name
        this.description = description;
    }

    public void setPrice(double price) { // Corrected field name and data type
        this.price = price;
    }
}
