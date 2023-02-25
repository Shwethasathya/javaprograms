package com.xworkz.forest.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindAreaByName {

	public static void main(String[] args) {
		
		System.out.println("running findByName");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("FindAreaByName");
		Object obj = query.getSingleResult();
		Double area =(Double) obj;
		System.out.println(area);
		manager.close();
		
	}
}
