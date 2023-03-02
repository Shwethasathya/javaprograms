package com.xworkz.court.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

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
		return true;

	}

	@Override
	public CourtEntity findById(int id) {
		System.out.println("find in repo " + id);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		CourtEntity entity = entityManager.find(CourtEntity.class, id);
		entityManager.close();
		return entity;
	}

	@Override
	public List<CourtEntity> findByLocation(String location) {
		System.out.println("running findByLocation");

		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("findByLocation");
			query.setParameter("location", location);
			List<CourtEntity> lists = query.getResultList();
			return lists;
		} finally {

			entityManager.close();
		}

	}

	@Override
	public boolean update(CourtEntity entity) {
		System.out.println("created" + getClass().getSimpleName());
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.merge(entity);
			transaction.commit();
			return true;

		} finally {
			manager.close();
		}
	}

	@Override
	public CourtEntity deleteById(int id) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		CourtEntity courtEntity = manager.find(CourtEntity.class, id);
		if (courtEntity != null) {
			transaction.begin();
			manager.remove(courtEntity);
			transaction.commit();
			manager.close();
			return courtEntity;
		} else {
			return CourtRepository.super.deleteById(id);
		}

	}

}