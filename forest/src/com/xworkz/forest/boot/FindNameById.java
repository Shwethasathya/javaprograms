package com.xworkz.forest.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindNameById {

	public static void main(String[] args) {

		System.out.println("running FindNameById");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("FindNameById");
		Object obj = query.getSingleResult();
		String name = (String) obj;
		System.out.println(name);
		manager.close();
	}
}
