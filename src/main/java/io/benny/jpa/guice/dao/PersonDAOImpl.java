package io.benny.jpa.guice.dao;

import io.benny.jpa.guice.entities.Person;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.google.inject.Inject;
import com.google.inject.persist.Transactional;

public class PersonDAOImpl implements PersonDAO {
	@Inject
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Person> findByName(String name) {
		Query query = em.createNamedQuery(Person.FIND_PERSON);
		query.setParameter("name", "Benny");
		return query.getResultList();
	}
	
	@Transactional
	public void createPerson(Person p) {
		em.persist(p);
		em.close();
	}
}
