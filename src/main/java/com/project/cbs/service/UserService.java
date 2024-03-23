package com.project.cbs.service;

import java.util.List;

import com.project.cbs.entity.Car;

// This interface defines the contract for UserService
public interface UserService {
    // Method to perform user login
    String login(String email , String password);
    
    // Method to retrieve all cars available in the system
    public List<Car> getAllCars();
}
