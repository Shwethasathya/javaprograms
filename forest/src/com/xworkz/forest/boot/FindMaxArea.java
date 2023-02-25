package com.xworkz.forest.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindMaxArea {

	public static void main(String[] args) {
		
		System.out.println("running FindMaxArea");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("FindMaxArea");
		Object obj = query.getSingleResult();
		Double max = (Double) obj;
		System.out.println(max);
		manager.close();
	}
}
