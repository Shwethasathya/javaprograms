package com.xworkz.pizza.boot;

import java.time.LocalDateTime;

import com.xworkz.pizza.dto.PizzaDto;
import com.xworkz.pizza.service.PizzaServiceImple;
import com.xworkz.pizza.service.PizzaServices;
import com.xworkz.pizza.thing.PizzaSize;

public class PizzaRunner {

	public static void main(String[] args) {

		PizzaDto pizza = new PizzaDto();
		pizza.setName("peppy paneer");
		pizza.setCompany("dominoz");
		pizza.setCheese(false);
		pizza.setFlavour("onion");
		pizza.setPrice(199);
		pizza.setSize(PizzaSize.MEDIUM);
		pizza.setType("veg");
		pizza.setCreatedDate(LocalDateTime.now());
		pizza.setCreatedy("System");
		pizza.setUpdatedBy("shwetha");
		pizza.setUpdatedDate(LocalDateTime.now());

		PizzaServices pizzaServices = new PizzaServiceImple();

		pizzaServices.pizzaServices(pizza);

	}
}
