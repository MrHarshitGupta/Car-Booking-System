package com.project.cbs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Entity annotation indicates that this class represents a database entity
@Entity
public class Car {
    // Id annotation specifies the primary key of the entity
    @Id
    // GeneratedValue annotation indicates that the primary key value will be automatically generated
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CarID; // Unique identifier for the car
    private String Model_Name; // Name of the car model
    private int Price_Per_Km; // Price charged per kilometer for renting the car
    private int CategoryId; // Category ID to which the car belongs

    // Getter and setter methods for CarID
    public int getCarID() {
        return CarID;
    }

    public void setCarID(int carID) {
        CarID = carID;
    }

    // Getter and setter methods for Model_Name
    public String getModel_Name() {
        return Model_Name;
    }

    public void setModel_Name(String model_Name) {
        Model_Name = model_Name;
    }

    // Getter and setter methods for Price_Per_Km
    public int getPrice_Per_Km() {
        return Price_Per_Km;
    }

    public void setPrice_Per_Km(int price_Per_Km) {
        Price_Per_Km = price_Per_Km;
    }

    // Getter and setter methods for CategoryId
    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }

    // Override toString method to provide a string representation of the object
    @Override
    public String toString() {
        return "Car [CarID=" + CarID + ", Model_Name=" + Model_Name + ", Price_Per_Km=" + Price_Per_Km + ", CategoryId="
                + CategoryId + "]";
    }
}
