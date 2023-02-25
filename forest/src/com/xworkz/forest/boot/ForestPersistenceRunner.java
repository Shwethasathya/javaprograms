package com.xworkz.forest.boot;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.forest.entity.ForestEntity;

public class ForestPersistenceRunner {

	public static void main(String[] args) {

		System.out.println("running ForestPersistenceRunner");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		ForestEntity entity = new ForestEntity(0, "gir forest", "karnataka", "reservoir", 5423D);

		
		
		ForestEntity entity1 = new ForestEntity(0, "Bandhavgarh forest", "madya pradesh", "national park", 77.9);
		ForestEntity entity2 = new ForestEntity(0, "Satpura forest", "madya pradesh", "national park", 89.9);
		ForestEntity entity3 = new ForestEntity(0, "evergreen forest", "karnataka", "tropical", 91.9);
		ForestEntity entity4 = new ForestEntity(0, "Nilagiri", "Maharastra", "Bioshere", 123.4);
		ForestEntity entity5 = new ForestEntity(0, "Kukiral", "Odissa", "Conservative", 13455D);
		ForestEntity entity6 = new ForestEntity(0, "Bandipuur", "Karnataka", "BioConservative", 366D);

		transaction.begin();
		manager.persist(entity);

		manager.persist(entity1);
		manager.persist(entity2);
		manager.persist(entity3);
		manager.persist(entity4);
		manager.persist(entity5);
		manager.persist(entity6);
		transaction.commit();
	}
}
