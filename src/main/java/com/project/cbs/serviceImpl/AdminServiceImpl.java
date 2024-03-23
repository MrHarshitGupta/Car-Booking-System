package com.project.cbs.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.cbs.entity.Car;
import com.project.cbs.entity.CarCategory;
import com.project.cbs.repository.CarCategoryRepo;
import com.project.cbs.repository.CarRepo;
import com.project.cbs.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    CarRepo carRepo;

    @Autowired
    CarCategoryRepo catRepo;
	
    // Method to add a new car
    @Override
    public void addCar(Car car) {
        carRepo.save(car);
    }

    // Method to get all car categories
    @Override
    public List<CarCategory> getCategory() {
        return catRepo.findAll();
    }

    // Method to add a new car category
    @Override
    public void addCarCat(CarCategory carCat) {
        catRepo.save(carCat);
    }

    // Method to get all cars
    @Override
    public List<Car> getAllCars() {
        return carRepo.findAll();
    }

    // Method to delete a category by ID
    @Override
    public void deleteById(int id) {
        catRepo.deleteById(id);
    }

}
