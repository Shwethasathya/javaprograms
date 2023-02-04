package com.xworkz.goa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.Dto.CasinoDto;

@Controller
@RequestMapping("/sent")
public class CasinoController {

	public CasinoController() {
		System.out.println("created " + getClass().getSimpleName());
	}

	@GetMapping
	public String onCasino(CasinoDto dto, Model model) {

		System.out.println("running onCasino " + dto);
		model.addAttribute("name ", dto.getName());
		model.addAttribute("entryFee ", dto.getEntryFee());
		return "CasinoSuccess.jsp";
	}

}
