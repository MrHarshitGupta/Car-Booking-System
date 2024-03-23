package com.project.cbs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Entity annotation indicates that this class represents a database entity
@Entity
public class Admin {
    // Id annotation specifies the primary key of the entity
    @Id
    // GeneratedValue annotation indicates that the primary key value will be automatically generated
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // Unique identifier for the admin
    private String email; // Email address of the admin
    private String password; // Password of the admin

    // Getter and setter methods for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and setter methods for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and setter methods for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
