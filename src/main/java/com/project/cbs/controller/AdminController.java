package com.project.cbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.cbs.entity.Car;
import com.project.cbs.entity.CarCategory;
import com.project.cbs.repository.CarCategoryRepo;
import com.project.cbs.serviceImpl.AdminServiceImpl;

@Controller
public class AdminController {
	@Autowired
	AdminServiceImpl adminService;

	@Autowired
	CarCategoryRepo carCatRepo;
	
	// Mapping for adding a new car
	@GetMapping("admin/addcar")
	public String addCar(Model model) {
		model.addAttribute("car", new Car()); // new car object whose variable should be injected on view
		model.addAttribute("categories", adminService.getCategory()); // categories we need to show on form of on car
		model.addAttribute("allCars", adminService.getAllCars()); // all cars we need to show on page
		System.out.println("AddCar from admin controller called");
		System.out.println(model.getAttribute("car"));
		System.out.println(model.getAttribute("categories"));
		System.out.println(model.getAttribute("allCars"));

		return "addcar";
	}

	// Mapping for adding a new car (POST request)
	@PostMapping("admin/addcar")
	public String adddCar(Model model) {
		System.out.println("AddCar post mapping admin controller called");
		model.addAttribute("allCars", adminService.getAllCars()); // all cars we need to show on page after adding a new
																	// car
		return "addcar";
	}

	// Mapping for adding categories
	@GetMapping("admin/addcategories")
	public String addCategories(Model model) {
		model.addAttribute("car",new CarCategory());				// new CarCategory object whose variable shoulb be injected on view
		model.addAttribute("categories",adminService.getCategory()); // categories we need to show on form of on car 
		System.out.println("AddCar from admin controller called");
		System.out.println(model.getAttribute("car"));
		System.out.println(model.getAttribute("categories"));
		System.out.println(model.getAttribute("allCars"));
		return "addcategories";
	}

	// Mapping for adding categories (POST request)
	@PostMapping("admin/addcategories")
	public String addCategories(@ModelAttribute("carCategory") CarCategory c,Model model) {
		System.out.println(c);
		carCatRepo.save(c);
		return "redirect:/admin/addcategories";
	}
	
	// Mapping for deleting categories
	@GetMapping("/admin/addcategories/delete/{id}")
	public String CatDelete(@PathVariable int id) {
		adminService.deleteById(id);
		return "redirect:/admin/addcategories";
	}
}
