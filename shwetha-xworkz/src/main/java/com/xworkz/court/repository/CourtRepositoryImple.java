package com.xworkz.court.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.court.entity.CourtEntity;

@Repository
public class CourtRepositoryImple implements CourtRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public CourtRepositoryImple() {
		System.out.println("created" + getClass().getSimpleName());
	}
	
	

	@Override
	public boolean save(CourtEntity entity) {
		System.out.println("created" + getClass().getSimpleName());
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return false;


	}

}
