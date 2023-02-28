package com.xworkz.court.repository;

import com.xworkz.court.entity.CourtEntity;

public interface CourtRepository {

	boolean save(CourtEntity entity);
	
	default CourtEntity findById(int id) {
		return null;
	}
	
	
}
