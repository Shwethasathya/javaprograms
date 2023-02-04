package com.xworkz.goa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.Dto.BeachDto;

@Controller
@RequestMapping("/beach")
public class BeachController {

	public BeachController() {
		System.out.println("created " + getClass().getSimpleName());
	}

	@GetMapping
	public String onBeach(BeachDto dto, Model model) {

		System.out.println("running onBeach " +dto);
		model.addAttribute("name ", dto.getName());
		model.addAttribute("location ", dto.getLocation());
		return "BeachSuccess.jsp";
	}
}
