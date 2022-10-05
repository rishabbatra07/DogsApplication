package com.pro.dap.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pro.dap.dao.DogsRepository;
import com.pro.dap.entities.Dogs;




@Controller
@RequestMapping("/dogs")
public class DogsController {
	@Autowired
	DogsRepository dogsRepo;
	@GetMapping
	public String displayEmployees(Model model) {
		List<Dogs> dogs= dogsRepo.findAll();
		model.addAttribute("dogs",dogs);
		return "dogs/list-dog";
		
	}
	@RequestMapping("/new")
	public String displayDogForm(Model model) {
		Dogs aDog= new Dogs();
		model.addAttribute("dog",aDog);
		return "/dogs/new-dog";
	}
	
	@PostMapping("/save")
	public String createDog(Dogs dog,Model model) {
		dogsRepo.save(dog);
		return "redirect:/dogs/new";
	}
}
