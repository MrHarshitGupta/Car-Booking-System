package com.project.cbs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.cbs.entity.Car;
import com.project.cbs.entity.CarCategory;

// Service annotation indicates that this interface defines a service component
@Service
public interface AdminService {
    
    // Method to add a new car to the system
    public void addCar(Car car);
    
    // Method to retrieve all available car categories
    public List<CarCategory> getCategory();
    
    // Method to add a new car category to the system
    public void addCarCat(CarCategory carCat);
    
    // Method to retrieve all cars from the system
    public List<Car> getAllCars();
    
    // Method to delete a car by its ID
    public void deleteById(int id);
}
