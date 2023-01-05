package com.xworkz.stream.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.stream.constant.WeaponType;
import com.xworkz.stream.dto.WeaponDto;

public class WeaponRunner {

	public static void main(String[] args) {

		Collection<WeaponDto> dto = new ArrayList();

		dto.add(new WeaponDto("Gun", "india", "steel", 1200.0, WeaponType.MILITARY));
		dto.add(new WeaponDto("knife", "pavitra", "steel", 50.5, WeaponType.LONG));
		dto.add(new WeaponDto("Bow and Arrow", "india", "wood", 130.0, WeaponType.RECURVE_BOW));
		dto.add(new WeaponDto("Trident", "shwetha", "wood", 100.0, WeaponType.LONG));
		dto.add(new WeaponDto("boomerang", "india", "wood", 120.0, WeaponType.RANGED_WEAPON));
		dto.add(new WeaponDto("bazooka", "rashmi", "steel", 1200.0, WeaponType.ROCKET));
		dto.add(new WeaponDto("dagger", "india", "iron", 150.00, WeaponType.HAND_WEAPON));
		dto.add(new WeaponDto("hammer", "venky", "iron", 200.00, WeaponType.HAND_WEAPON));
		dto.add(new WeaponDto("stick", "shilpa", "wood", 50.0, WeaponType.HAND_WEAPON));
		dto.add(new WeaponDto("bomb", "chandu", "chemicals", 140.0, WeaponType.EXPLOSIVES));
		dto.add(new WeaponDto("air gun", "yoga", "plastic", 50.0, WeaponType.PLAYING));
		dto.add(new WeaponDto("Whip", "india", "steel", 50.5, WeaponType.HAND_WEAPON));
		dto.add(new WeaponDto("Ax", "india", "wood and iron", 100.0, WeaponType.RANGED_WEAPON));
		dto.add(new WeaponDto("Club", "yoga", "wood", 100.0, WeaponType.HAND_WEAPON));
		dto.add(new WeaponDto("sward", "india", "iron", 300.0, WeaponType.HAND_WEAPON));
		dto.add(new WeaponDto("torpedo", "shilpa", "wood", 2000.0, WeaponType.MILITARY));
		dto.add(new WeaponDto("dagger", "pavitra", "iron", 150.00, WeaponType.HAND_WEAPON));
		dto.add(new WeaponDto("hammer", "india", "iron", 200.00, WeaponType.HAND_WEAPON));
		dto.add(new WeaponDto("stick", "shwetha", "wood", 50.0, WeaponType.HAND_WEAPON));
		dto.add(new WeaponDto("bomb", "india", "chemicals", 140.0, WeaponType.EXPLOSIVES));

		System.out.println(System.lineSeparator());
		System.out.println("=========print all weapons by price greater============");
		dto.stream().filter(ele -> ele.getPrice() > 100).forEach(e -> System.out.println(e));

		System.out.println(System.lineSeparator());
		System.out.println("==============print all weapons by madeon and madeby==============");
		dto.stream().forEach(ele -> {
			System.out.println("made by " + ele.getMadeBy());
			System.out.println("made on " + ele.getMadeOn());
		});

		System.out.println(System.lineSeparator());
		System.out.println("==========print all weapons by name sorted in desc order=============");
		dto.stream().sorted().forEach(d -> System.out.println(d));

		System.out.println(System.lineSeparator());
		System.out.println("====print all elements weapons sort by made by=========");
		dto.stream().sorted((a, b) -> a.getMadeBy().compareTo(b.getMadeBy())).forEach(ele -> System.out.println(ele));

		System.out.println(System.lineSeparator());
		System.out.println("====print all elements weapons sort by made on=========");
		dto.stream().sorted((a, b) -> a.getMadeOn().compareTo(b.getMadeOn())).forEach(ele -> System.out.println(ele));

		System.out.println(System.lineSeparator());
		System.out.println("====print all elements weapons sort by price=========");
		dto.stream().sorted((a, b) -> a.getPrice().compareTo(b.getPrice())).forEach(ele -> System.out.println(ele));

		System.out.println(System.lineSeparator());
		System.out.println("====print all elements weapons sort by price desc=========");
		dto.stream().sorted((a1, a2) -> a1.getPrice().compareTo(a2.getPrice())).forEach(ele -> System.out.println(ele));

		System.out.println(System.lineSeparator());
		dto.stream().sorted((a1, a2) -> a1.getName().compareTo(a2.getMadeOn())).forEach(ele -> System.out.println(ele));

	}

}