package io.benny.jpa.guice.main;

import io.benny.jpa.guice.dao.PersonDAO;
import io.benny.jpa.guice.entities.Person;
import io.benny.jpa.guice.jpa.JpaInitializer;

import java.util.List;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.persist.jpa.JpaPersistModule;


public class Main {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new ApplicationModule(), new JpaPersistModule("GuiceTest"));
		JpaInitializer initializer = injector.getInstance(JpaInitializer.class);
		
		
		PersonDAO personDAO = injector.getInstance(PersonDAO.class);
		List<Person> people = personDAO.findByName("Benny");
		people.forEach(System.out::println);
		
		Person p = new Person();
		p.setName("Benny");
		p.setAge(28);
		
		personDAO.createPerson(p);
	}
}
