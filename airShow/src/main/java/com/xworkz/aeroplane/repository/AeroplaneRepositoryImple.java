package com.xworkz.aeroplane.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.aeroplane.entity.AeroplaneEntity;

@Repository
public class AeroplaneRepositoryImple implements AeroplaneRepository{

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public AeroplaneRepositoryImple() {
	System.out.println("created" + getClass().getSimpleName());
	}
	
	@Override
	public boolean save(AeroplaneEntity entity) {
		System.out.println("created" + getClass().getSimpleName());
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return false;
	}
	
	@Override
	public AeroplaneEntity findById(int id) {
		System.out.println("find in repo " +id);
		EntityManager entityManager= this.entityManagerFactory.createEntityManager();
		AeroplaneEntity entity=entityManager.find(AeroplaneEntity.class,id);
		entityManager.close();
		return entity;
		
	}
}
