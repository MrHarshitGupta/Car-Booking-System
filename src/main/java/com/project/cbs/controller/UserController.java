package com.project.cbs.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.cbs.entity.User;
import com.project.cbs.repository.UserRepository;
import com.project.cbs.serviceImpl.UserServiceImpl;

import jakarta.servlet.http.HttpSession;


@Controller
public class UserController {
	
	@Autowired
	private UserRepository repo;
	@Autowired
	private UserServiceImpl userService;
	
//	 @Autowired
//	    private HttpSession httpSession;
//	 
//	 @GetMapping("/your-page")
//	    public String yourPage() {
//	        // Remove the 'message' attribute from the session
//	        httpSession.removeAttribute("message");
//	        
//	        // Return the view name to be rendered
//	        return "your-template-name";
//	    }
	
	@GetMapping("/")
	public String home(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "index";
	
	}
	
	@GetMapping("/register")
	public String register() {
		
		return "register";
	}
	@PostMapping("/register")
	public String register(@ModelAttribute("user") User u,Model model) {
		boolean doesExist=userService.checkEmail(u.getEmail());
		System.out.println(u);
		if(doesExist) {
			System.out.println("Email id has been already exists");
			model.addAttribute("msg","Email id has been already exists");
		}
		else {
			repo.save(u);
			System.out.println("User Register Sucessfully...");
			model.addAttribute("msgs", "User Register Sucessfully... Please Log in.");
		}
		return "register";
	}

}
