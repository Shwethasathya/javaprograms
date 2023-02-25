package com.xworkz.forest.boot;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.forest.entity.ForestEntity;

public class FindByName {

	public static void main(String[] args) {

		System.out.println("running findByName");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByName");
		Object obj = query.getSingleResult();
		ForestEntity name = (ForestEntity) obj;
		System.out.println(name);
		manager.close();

	}
}
