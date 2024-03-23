package com.project.cbs.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.cbs.entity.Admin;
import com.project.cbs.entity.Car;
import com.project.cbs.entity.User;
import com.project.cbs.repository.AdminRepo;
import com.project.cbs.repository.CarRepo;
import com.project.cbs.repository.UserRepository;
import com.project.cbs.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepo;

    @Autowired
    AdminRepo adminRepo;

    @Autowired
    CarRepo carRepo;

    // Method to handle user login
    @Override
    public String login(String email, String password) {
        List<User> users = userRepo.findAll();
        List<Admin> admins = adminRepo.findAll();
        
        // Check if user exists and credentials match
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return "user";
            }
        }
        
        // Check if admin exists and credentials match
        for (Admin admin : admins) {
            if (admin.getEmail().equals(email) && admin.getPassword().equals(password)) {
                return "admin";
            }
        }
        
        return "InvalidUser";
    }

    // Method to get username by email
    public String getUsername(String email) {
        List<User> users = userRepo.findAll();
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user.getFullname();
            }
        }
        return null;
    }

    // Method to check if email exists
    public boolean checkEmail(String email) {
        return userRepo.existsByEmail(email);
    }

    // Method to get all cars
    @Override
    public List<Car> getAllCars() {
        return carRepo.findAll();
    }

}
