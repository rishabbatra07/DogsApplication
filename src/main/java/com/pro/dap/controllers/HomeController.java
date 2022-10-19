package com.pro.dap.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pro.dap.dao.DogsRepository;
import com.pro.dap.entities.Dogs;

@Controller
public class HomeController {
	@Autowired
	DogsRepository dogRepo;
	@GetMapping("/")
	public String displayName(Model model) {
		List<Dogs> dogs=dogRepo.findAll();
		model.addAttribute("dogs",dogs);
		return "main/home";
	}
}
