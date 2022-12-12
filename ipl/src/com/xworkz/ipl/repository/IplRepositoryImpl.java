package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.IplDTO;

public class IplRepositoryImpl implements IplRepository {

	private IplDTO[] ipldtos = new IplDTO[10];
	private int currentIndex = 0;

	@Override
	public boolean create(IplDTO dto) {
		System.out.println("running create of iplDTO");
		if (this.currentIndex >= this.ipldtos.length) {
			System.out.println("sizde exceeded cannot add more teams");
			return false;
		}
		this.ipldtos[this.currentIndex] = dto;
		System.out.println(dto + "in the index " + this.currentIndex);
		this.currentIndex++;
		return true;
	}
}
