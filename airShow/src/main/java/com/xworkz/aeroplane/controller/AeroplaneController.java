package com.xworkz.aeroplane.controller;

import java.util.Arrays;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.aeroplane.dto.AeroplaneDto;
import com.xworkz.aeroplane.service.AeroplaneService;

@Controller
@RequestMapping("/")
public class AeroplaneController {

	@Autowired
	private AeroplaneService aeroplaneService;

	private List<String> type = Arrays.asList("cargo", "commercial", "defence", "business");

	private List<String> country = Arrays.asList("India", "Austrelia", "US", "China", "Japan");


	public AeroplaneController() {
		System.out.println("created" + getClass().getSimpleName());
	}

	@GetMapping("/plane")
	
	public String onAeroplane(Model model) {

		
		
		model.addAttribute("type", type);
		model.addAttribute("country", country);

		return "Registration";

	}

	@PostMapping("/plane")
	public String onAeroplane(Model model, AeroplaneDto dto) {

		System.out.println("running onAeroplane post method" + dto);

		Set<ConstraintViolation<AeroplaneDto>> violations = this.aeroplaneService.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("no violations in controller");

			return "Registration";
		}
		model.addAttribute("type", type);
		model.addAttribute("country", country);
		model.addAttribute("error", violations);
		model.addAttribute("dto", dto);
		System.out.println(dto);
		System.err.println("violations in controller");

		return "Registration";

	}
	
	@PostMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("running search id"+id);
		AeroplaneDto dto=this.aeroplaneService.findById(id);
		if(dto!=null) {
			model.addAttribute("dto", dto);
		}else {
			model.addAttribute("message", "not found");
		}
		return "Search";
	}
}