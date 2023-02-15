package com.xworkz.display.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.display.entity.ValentineEntity;

@Repository
public class ValentineRepoImple implements ValentineRepo {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public boolean save(ValentineEntity entity) {
		System.out.println("created" + getClass().getSimpleName());
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}
}
