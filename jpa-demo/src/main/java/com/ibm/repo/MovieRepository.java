package com.ibm.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ibm.entity.Movie;
import com.ibm.entity.Multiplex;

public class MovieRepository {
private EntityManagerFactory factory;
public MovieRepository() {
	factory= Persistence.createEntityManagerFactory("MyJpa");
}
public void addMultiplex(Multiplex m) {
	EntityManager em = factory.createEntityManager();
	EntityTransaction txn= em.getTransaction();
	txn.begin();
	em.persist(m);
	txn.commit();
	em.close();
}
public void addMovie(Movie m) {
	EntityManager em = factory.createEntityManager();
	EntityTransaction txn = em.getTransaction();
	txn.begin();
	em.persist(m);
	txn.commit();
	em.close();
}
public void addMovieToMultiplex(int movId, int mpexId) {
	EntityManager em = null;
	EntityTransaction txn = null;
	try {
		em= factory.createEntityManager();
		txn=em.getTransaction();
		txn.begin();
		Movie mov =em.find(Movie.class, movId);
		Multiplex mpex= em.find(Multiplex.class, mpexId);
		mov.getMultiplexes().add(mpex);
		txn.commit();
	}
	catch(Exception e)
	{
		e.printStackTrace();
		txn.rollback();
	}finally {
		em.close();
	}
}
}
