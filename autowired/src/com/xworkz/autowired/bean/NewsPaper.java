package com.xworkz.autowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
	@Autowired
	@Qualifier("paperId")
	private int id; // property
	private String name; // cons
	private String ownerName; // cons
	@Autowired
	@Qualifier("paperLanguage")
	private String language; // property
	private double price; // setter

	public NewsPaper() {

	}

	public NewsPaper(int id, @Qualifier("paperName") String name, @Qualifier("ownerName") String ownerName,
			String language, double price) {
		super();
		this.id = id;
		this.name = name;
		this.ownerName = ownerName;
		this.language = language;
		this.price = price;
	}

	@Autowired
	@Bean("paperPrice")
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", language=" + language
				+ ", price=" + price + "]";
	}

	
}
