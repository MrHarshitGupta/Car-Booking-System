package com.project.cbs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Entity annotation indicates that this class represents a database entity
@Entity
// Table annotation specifies the name of the database table to which this entity is mapped
@Table(name= "User")
public class User {

    // Id annotation specifies the primary key of the entity
    @Id
    // GeneratedValue annotation indicates that the primary key value will be automatically generated
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // Unique identifier for the user

    // Column annotation specifies the mapping of the property to the column in the database table
    @Column(name = "Name  ")
    private String fullName; // Full name of the user

    private String gender; // Gender of the user
    private String dob; // Date of birth of the user
    private String address; // Address of the user
    private String email; // Email address of the user
    private String password; // Password of the user

    // Getter and setter methods for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and setter methods for fullName
    public String getFullname() {
        return fullName;
    }

    public void setFullname(String fullname) {
        this.fullName = fullname;
    }

    // Getter and setter methods for gender
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Getter and setter methods for dob
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    // Getter and setter methods for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    // Override toString method to provide a string representation of the object
    @Override
    public String toString() {
        return "User [id=" + id + ", fullname=" + fullName + ", gender=" + gender + ", dob=" + dob + ", address="
                + address + ", email=" + email + ", password=" + password + "]";
    }
}
