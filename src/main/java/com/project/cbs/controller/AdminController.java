package com.project.cbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.cbs.entity.Car;
import com.project.cbs.serviceImpl.AdminServiceImpl;

@Controller
public class AdminController {
	@Autowired
	AdminServiceImpl adminService;
	
	@GetMapping("admin/addcar")
	public String addCar(Model model) {
		model.addAttribute("car",new Car());
		model.addAttribute("categories",adminService.getCategory());
		System.out.println("AddCar from admin controller called");
		System.out.println(model.getAttribute("car"));
		return "addcar2";
		
	}
	
}
