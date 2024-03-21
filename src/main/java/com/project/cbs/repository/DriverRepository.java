package com.project.cbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.cbs.entity.Driver;

public interface DriverRepository extends JpaRepository<Driver, Integer> {

}
