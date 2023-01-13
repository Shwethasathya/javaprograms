package com.xworkz.autowired.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.autowired")
public class PaperConfiguration {

	public PaperConfiguration() {
		// TODO Auto-generated constructor stub
	}

	@Bean
	public int paperId() {
		System.out.println("registering id...");
		return 45;
	}

	@Bean
	public String paperName() {
		System.out.println("registering paperName...");
		return "Prajavani";
	}

	@Bean
	public String ownerName() {
		System.out.println("registering ownerName...");
		return "Guruswamy";
	}

	@Bean
	public String paperLanguage() {
		System.out.println("registering paperLanguage...");
		return "Kannada";
	}

	@Bean
	public double paperPrice() {
		System.out.println("registering paperPrice...");
		return 5.0;
	}

	@Bean
	public String engineName() {
		System.out.println("registering engineName");
		return "diesel";
	}

	@Bean
	public String engineType() {
		System.out.println("registering engineType");
		return "electric engine";
	}

	@Bean
	public int engineNumber() {
		System.out.println("registering engineNumber");
		return 12;
	}

	@Bean
	public Double engineVersion() {
		System.out.println("registering engineVersion");
		return 4.5;
	}

	@Bean
	public String engineCompany() {
		System.out.println("registering engineCompany");
		return "jiffy lube";
	}

	@Bean
	public int stroke() {
		System.out.println("registering strokes");
		return 4;
	}

	@Bean
	public String snakeName() {
		System.out.println("registering snakeName");
		return "green snake";
	}

	@Bean
	public double snakeLength() {
		System.out.println("registering snakeLength");
		return 3.5;
	}

	@Bean
	public String snakeColor() {
		System.out.println("registering snakeColor");
		return "green";
	}

	@Bean
	public String snakeType() {
		System.out.println("registering snakeType");
		return "cobra";
	}

	@Bean
	public boolean poisionous() {
		System.out.println("registering poisionous");
		return true;
	}

	@Bean
	public String ghostName() {
		System.out.println("registering ghostName");
		return "abc";
	}

	@Bean
	public String ghostColor() {
		System.out.println("registering ghostColor");
		return "black";
	}

	@Bean
	public LocalDate date() {
		System.out.println("registering date");
		return LocalDate.of(2022, 2, 8);
	}

	@Bean
	public double nailLength() {
		System.out.println("registering nailLength");
		return 4.5;
	}

	@Bean
	public double ghostHeight() {
		System.out.println("registering ghostHeight");
		return 7.4;
	}

	@Bean
	public int fingers() {
		System.out.println("registering fingers");
		return 10;
	}

	@Bean
	public boolean isNailsAvailable() {
		System.out.println("registering isNailsAvailable");
		return true;
	}

	@Bean
	public String ghostEyeColor() {
		System.out.println("registering ghostEyeColor");
		return "black";
	}

	@Bean
	public String ghostHairColor() {
		System.out.println("registering ghostHairColor");
		return "black";
	}

	@Bean
	public double hairLength() {
		System.out.println("registering hairLength");
		return 5.6;
	}

	@Bean
	public String reasonOfDeath() {
		System.out.println("registering reasonOfDeath");
		return "heartAttack";
	}

	@Bean
	public String speakingLanguage() {
		System.out.println("registering speakingLanguage");
		return "kannada";
	}

	@Bean
	public String ghostFather() {
		System.out.println("registering ghostFather");
		return "xyz";
	}

	@Bean
	public String ghostMother() {
		System.out.println("registering ghostMother");
		return "ccv";
	}

	@Bean
	public String workingWas() {
		System.out.println("registering workingWas");
		return "software Engineer";
	}

	@Bean
	public String ghostPlace() {
		System.out.println("registering ghostPlace");
		return "Bangalore";
	}

	@Bean
	public boolean ghostMarried() {
		System.out.println("registering ghostMarried");
		return false;
	}

	@Bean
	public LocalDate birthDate() {
		System.out.println("registering birthDate");
		return LocalDate.of(1986, 7, 6);
	}

	@Bean
	public double salary() {
		System.out.println("registering salary");
		return 12.5;
	}

}
