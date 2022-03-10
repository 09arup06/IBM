package com.ibm.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



import com.ibm.entity.Customer;

public class CustomerRepository {
	private EntityManagerFactory factory;

	public CustomerRepository() {
		factory = Persistence.createEntityManagerFactory("MyJpa");
	}

	public boolean save(Customer c) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(c);
		txn.commit();
		em.close();
		return true;
	}

	public Customer fetch(int id) {
EntityManager em = factory.createEntityManager();
Customer c = em.find(Customer.class,id);
return c;
	}

public List<Customer> list(){
	EntityManager em = factory.createEntityManager();
	Query que = em.createQuery("from Customer");
	return que.getResultList();
}
public boolean update(Customer c) {
	EntityManager em = factory.createEntityManager();
	EntityTransaction txn = em.getTransaction();
	txn.begin();
	em.merge(c);
	txn.commit();
	em.close();
	return true;
}
public boolean delete(int id) {
	EntityManager em = factory.createEntityManager();
	EntityTransaction txn = em.getTransaction();
	txn.begin();
	Customer c = em.find(Customer.class, id);
	em.remove(c);
	txn.commit();
	em.close();
	return true;
}
}
