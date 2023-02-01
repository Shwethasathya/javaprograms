package com.xworkz.food.component;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/sent")
public class FoodComponent {

	public FoodComponent() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@GetMapping
	public String onSend(@RequestParam String name, @RequestParam String type, @RequestParam int quantity,
			@RequestParam double price) {
		System.out.println("running onSend post");
		System.out.println("Name " + name);
		System.out.println("Type " + type);
		System.out.println("Quantity " + quantity);
		System.out.println("Price" + price);
		return "foodItem.jsp";
	}
}
