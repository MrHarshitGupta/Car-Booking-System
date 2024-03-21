package com.project.cbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.cbs.entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {

}
