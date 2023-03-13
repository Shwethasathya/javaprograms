package com.xworkz.court.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.court.entity.CourtEntity;

public interface CourtRepository {

	boolean save(CourtEntity entity);

	default CourtEntity findById(int id) {
		return null;
	}

	default List<CourtEntity> findByLocation(String company) {
		return Collections.emptyList();

	}

	boolean update(CourtEntity entity);

	default CourtEntity deleteById(int id) {
		return null;
	}

	default List<CourtEntity> find() {
		return Collections.emptyList();
	}
}
