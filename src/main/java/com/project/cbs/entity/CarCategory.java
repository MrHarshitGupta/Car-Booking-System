package com.project.cbs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
// Specifies that this class is an entity and will be mapped to a database table
public class CarCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Specifies the primary key and its generation strategy
    private int id;

    private String name;
    // Name of the car category

    private String descr;
    // Description of the car category

    // Getters and setters for private fields
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String desc) {
        this.descr = desc;
    }

    // toString method for debugging and logging
    @Override
    public String toString() {
        return "CarCategory [id=" + id + ", name=" + name + ", descr=" + descr + "]";
    }
}
