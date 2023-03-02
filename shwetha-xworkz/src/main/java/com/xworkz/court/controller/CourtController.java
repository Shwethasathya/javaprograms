package com.xworkz.court.controller;

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

import com.xworkz.court.dto.CourtDto;
import com.xworkz.court.service.CourtService;

@Controller
@RequestMapping("/")
public class CourtController {

	@Autowired
	private CourtService courtService;

	private List<String> type = Arrays.asList("pick pocket", "murder", "stolen", "divorce");

	private List<String> location = Arrays.asList("Bangalore", "Mysore", "Delhi", "Madras", "Meghalaya",
			"Andra pradesh");

	public CourtController() {
		System.out.println("created" + getClass().getSimpleName());
	}

	@GetMapping("/court")
	public String onCourt(Model model) {

		System.out.println("running onGet method");
		model.addAttribute("type", type);
		model.addAttribute("location", location);

		return "Detail";
	}

	@PostMapping("/court")
	public String onCourt(Model model, CourtDto dto) {
		System.out.println("running onAeroplane post method" + dto);

		Set<ConstraintViolation<CourtDto>> violations = this.courtService.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("no violations in controller");

			return "Detail";
		}
		model.addAttribute("type", type);
		model.addAttribute("location", location);
		model.addAttribute("error", violations);
		model.addAttribute("dto", dto);
		System.out.println(dto);
		System.err.println("violations in controller");

		return "Detail";
	}

	@PostMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {

		System.out.println("running search id" + id);
		CourtDto dto = this.courtService.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "not found");
		}
		return "Search";
	}
	
	@GetMapping("/searchbylocation")
	public String onSearchByLocation(@RequestParam String location, Model model) {

		System.out.println("running searchByLocation in controller " + location);
		List<CourtDto> courtDtos = this.courtService.findByLocation(location);

		model.addAttribute("courtDtos", courtDtos);
		return "SearchByLocation";
	}

	@GetMapping("/update")
	public String onUpdate(@RequestParam int id, Model model) {
		System.out.println("running update get method");
		System.out.println("running onUpdate " + id);
		CourtDto dto = this.courtService.findById(id);
		model.addAttribute("dto", dto);
		model.addAttribute("type", type);
		model.addAttribute("location", location);
		return "Update";
	}

	@PostMapping("/update")
	public String onUpdate(CourtDto dto, Model model) {
		System.out.println("running onUpdate " + dto);
		

		Set<ConstraintViolation<CourtDto>> constraintViolations = this.courtService.validateAndUpdate(dto);
		if (constraintViolations.size() > 0) {
			model.addAttribute("error", constraintViolations);
		} else {
			model.addAttribute("message", "update success");
		}
		return "Update";
	}

	@GetMapping("/delete")
	public String onDelete(@RequestParam int id, Model model) {
		System.out.println("running onDelete");
		CourtDto courtDto = this.courtService.deleteById(id);
		model.addAttribute("delete", courtDto);
		model.addAttribute("message", "deleted successfully");
		return "Delete";

	}
}
