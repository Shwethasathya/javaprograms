package com.xworkz.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.webapp.dto.BakeryDto;
import com.xworkz.webapp.service.BakeryService;

@Controller
@RequestMapping("/bakery")
public class BakeryController {

	@Autowired
	private BakeryService bakeryService;

	public BakeryController() {
		System.out.println("created" + getClass().getSimpleName());
	}

	@GetMapping
	public String onBakery(BakeryDto dto, Model model) {

		System.out.println("running onBakery " + dto);
		model.addAttribute("name", dto.getName());
		model.addAttribute("ownerName", dto.getOwnerName());
		model.addAttribute("wifeName", dto.getWifeName());
		model.addAttribute("married", dto.getMarried());
		model.addAttribute("famousFor", dto.getFamousFor());
		model.addAttribute("since", dto.getSince());
		boolean saved = this.bakeryService.validateAndSave(dto);
		System.out.println("saved " + saved);
		
		return "BakeryDetails.jsp";

	}
}
