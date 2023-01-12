package com.xworkz.bean.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.bean")
public class SpringConfiguration {

	@Bean
	public int id() {
		System.out.println("registering id..");
		return 23;
	}

	@Bean
	public String shopName() {
		System.out.println("registering name...");
		return "navkar hardware";
	}

	@Bean
	public String gstNo() {
		System.out.println("registering gstno..");
		return "gdt0000787788";
	}

	@Bean
	public String ownerName() {
		System.out.println("registering ownername...");
		return "sathya";
	}

	@Bean("address")
	public String address() {
		System.out.println("registering address...");
		return "vijaynagar";
	}

	@Bean
	public String softwareName() {
		System.out.println("registering softwares...");
		return "bank software";
	}

	@Bean
	public Double version() {
		System.out.println("registering version...");
		return 3.4;
	}

	@Bean
	public String developer() {
		return "shwetha";
	}

	@Bean
	public LocalDate date() {
		return LocalDate.now();
	}

	@Bean("free")
	public Boolean free() {
		return true;
	}

	@Bean
	public String companyName() {
		return "tcs";
	}

	@Bean
	public String empName() {
		return "shwetha";
	}

	@Bean
	public int experiance() {
		return 2;
	}

	@Bean
	public Double salary() {
		return 3.5;
	}

	@Bean
	public String pencilName() {
		return "apsara";
	}
	
	@Bean
	public Double pencilPrice() {
		return 10d;
	}

	@Bean
	public String pencilType() {
		return "led";
	}

	@Bean
	public String color() {
		return "black";
	}

	@Bean
	public boolean sharp() {
		return true;
	}

	@Bean
	public Boolean stolen() {
		return false;
	}

	@Bean
	public String rubberName() {
		return "apsara";
	}
	
	@Bean
	public String rubberType() {
		return "apsara";
	}
	
	@Bean
	public Double rubberPrice() {
		return 20d;
	}
	@Bean
	public String rubberColor() {
		return "red";
	}
	
	@Bean
	public String rubberShape() {
		return "round";
	}
	
	@Bean
	public char rubberSize() {
		return 'L';
	}

	@Bean
	public String bookName() {
		return "mahabaratha";
	}

	@Bean
	public Double bookPrice() {
		return 350d;
	}

	@Bean
	public int pages() {
		return 500;
	}

	@Bean
	public long phoneNumber() {
		return 8733066082L;
	}

	@Bean
	public boolean available() {
		return true;
	}

	@Bean
	public float volume() {
		return 6.4f;
	}

	@Bean
	public char bookSize() {
		return 'm';
	}

}
