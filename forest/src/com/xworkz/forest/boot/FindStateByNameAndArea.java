package com.xworkz.forest.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindStateByNameAndArea {

	public static void main(String[] args) {
		
		System.out.println("running FindStateByNameAndArea");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("FindStateByNameAndArea");
		Object obj = query.getSingleResult();
		String name = (String) obj;
		System.out.println(name);
		manager.close();
	}
}
