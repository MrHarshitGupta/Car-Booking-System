package com.project.cbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.cbs.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>   {
	
	public boolean existsByEmail(String email) ;
	
	
}
