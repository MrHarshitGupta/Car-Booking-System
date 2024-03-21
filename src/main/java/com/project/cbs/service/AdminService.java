package com.project.cbs.service;

import java.util.List;

import com.project.cbs.entity.Car;
import com.project.cbs.entity.CarCategory;
import com.project.cbs.entity.Driver;

public interface AdminService {
	public void addCar(Car car);
	public List<CarCategory> getCategory();
	public void addCarCat(CarCategory carCat);
	public void addDriver(Driver driver);
}
