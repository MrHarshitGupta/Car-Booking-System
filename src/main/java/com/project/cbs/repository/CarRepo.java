package com.project.cbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.cbs.entity.Car;

public interface CarRepo extends JpaRepository<Car, Integer> {

}
