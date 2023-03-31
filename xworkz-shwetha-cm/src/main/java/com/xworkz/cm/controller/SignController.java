package com.xworkz.cm.controller;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.cm.dto.SignUpDto;
import com.xworkz.cm.service.SignUpService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class SignController {

	@Autowired
	private SignUpService signUpService;

	public SignController() {
		log.info("created" + getClass().getSimpleName());
	}

	@PostMapping("/signUp")
	public String onSign(Model model, SignUpDto signUpDto) {

		List<SignUpDto> dtoList = this.signUpService.find();
		for (SignUpDto dto : dtoList) {

			if (signUpDto.getUserId().equals(dto.getUserId())) {
				model.addAttribute("existingUserId", "user id is already present");
				return "index";
			} else if (signUpDto.getEmail().equals(dto.getEmail())) {
				model.addAttribute("existingEmail", "email is already present");
				return "index";
			} else if (signUpDto.getMobileNo().equals(dto.getMobileNo())) {
				model.addAttribute("existing userId", "user id is already present");
				return "index";

			}

		}

		if (signUpDto.getPassword().equals(signUpDto.getConfirmPassword())) {
			Set<ConstraintViolation<SignUpDto>> violations = this.signUpService.validateAndSave(signUpDto);
			if (violations.isEmpty()) {
				model.addAttribute("save", "data saved");

				log.info(" " + signUpDto);
				return "index";
			} else {
				model.addAttribute("errors", violations);
				model.addAttribute("message", "data not saved");
			}
			return "index";

		} else {
			model.addAttribute("password", "password not matching");
		}
		return "index";
	}
}