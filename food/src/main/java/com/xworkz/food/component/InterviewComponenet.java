package com.xworkz.food.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.food.DTO.InterviewDto;

@Component
@RequestMapping("/attend")
public class InterviewComponenet {

	public InterviewComponenet() {
		System.out.println("created " + getClass().getSimpleName());
	}
@GetMapping
	public String onAttend(InterviewDto dto) {

		System.out.println("dto is " + dto);
		return "Interview.jsp";

	}
}
