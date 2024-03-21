package com.project.cbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.cbs.serviceImpl.UserServiceImpl;
@Controller
public class UserMainCountrol {
	@Autowired
	UserServiceImpl userService;
	
	@GetMapping("/login")
	public String login() {
		System.out.println("Log in");
		return "login";
	}

	@PostMapping("/postlogin")
	public String postLogin(@RequestParam ("email")String email,@RequestParam("password") String password ,Model  model) {
		System.out.println("userHOme");
		if (userService.login(email, password).equals("user")) {
			model.addAttribute("username",userService.getUsername(email));
			System.out.println(model.getAttribute("username"));
			return "userhome";
		}
		else if (userService.login(email, password).equals("admin")) {
			return "adminhome";
		}
		else {
			model.addAttribute("error","Invalid username and password");
			return"login";
		}
	}
	
	@PostMapping("/selectcar")
	public String car(@RequestParam ("pick_up_point")String pick_up_point,@RequestParam ("destination")String destination,Model model) {
		model.addAttribute(pick_up_point);
		model.addAttribute(destination);
		System.out.println(pick_up_point);
		System.out.println(destination);
		System.out.println(model.getAttribute("username"));
		return "choosecar";
	}
}
