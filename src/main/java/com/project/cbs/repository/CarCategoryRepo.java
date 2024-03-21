package com.project.cbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.cbs.entity.CarCategory;

public interface CarCategoryRepo extends JpaRepository<CarCategory, Integer> {

}
