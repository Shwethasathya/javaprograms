package com.xworkz.display.controller;

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

import com.xworkz.display.dto.ValentineDto;
import com.xworkz.display.service.ValentineService;

@Controller
@RequestMapping("/valentine")
public class ValentineController {

	@Autowired
	private ValentineService valentineService;

	private List<String> places = Arrays.asList("cubbon park", "lalbhag", "malls", "hebbal");

	private List<String> gifts = Arrays.asList("teddy", "chacolates", "phone");

	public ValentineController() {
		System.out.println("created" + getClass().getSimpleName());
	}

	@GetMapping
	public String onValentine(Model model) {
		System.out.println("running onValentine get method");

		
	//	List<String> places = Arrays.asList("cubbon park", "lalbhag", "malls", "hebbal");

		//List<String> gifts = Arrays.asList("teddy", "chacolates", "phone");
		
		model.addAttribute("places", places);
		model.addAttribute("gifts", gifts);

		return "Valentine";

	}

	@PostMapping
	public String onValentine(Model model, ValentineDto dto) {

		System.out.println("running onValentine post method" + dto);

		Set<ConstraintViolation<ValentineDto>> violations = valentineService.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("no violations in controller");

			return "ValentineSuccess";
		}
		model.addAttribute("places", places);
		model.addAttribute("gifts", gifts);
		model.addAttribute("error", violations);
		System.err.println("violations in controller");
		return "Valentine";

	}

}
