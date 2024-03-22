package com.project.cbs.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.cbs.entity.Admin;
import com.project.cbs.entity.User;
import com.project.cbs.repository.AdminRepo;
import com.project.cbs.repository.UserRepository;
import com.project.cbs.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepo;
	@Autowired
	AdminRepo adminRepo;
	@Override
	public boolean login(String email, String password) {
		User user = userRepo.findByEmail(email);
		return user.getPassword().equals(password);
		
	}
	public String getUsername(String email) {
		List <User> users=userRepo.findAll();
		for(User user :users) {
			if(user.getEmail().equals(email)) {
				return user.getFullname();
			}
		}
		return null;
	}

	public boolean checkEmail(String email){
		return userRepo.existsByEmail(email);
	}

}
