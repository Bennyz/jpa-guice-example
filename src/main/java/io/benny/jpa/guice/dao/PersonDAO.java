package io.benny.jpa.guice.dao;

import io.benny.jpa.guice.entities.Person;
import java.util.List;

public interface PersonDAO {
	List<Person> findByName(String name);
	
	void createPerson(Person p);
}
