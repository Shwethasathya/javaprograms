package com.xworkz.forest.boot;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.forest.entity.ForestEntity;

public class FindByState {

	public static void main(String[] args) {

		System.out.println("running findByName");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByState");
		Object obj = query.getSingleResult();
		ForestEntity state = (ForestEntity) obj;
		System.out.println(state);
		manager.close();

	}
}
