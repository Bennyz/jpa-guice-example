package io.benny.jpa.guice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="people")
@NamedQuery(name=Person.FIND_PERSON, query="select p from Person p where p.name = :name")
public class Person {
	
	public static final String FIND_PERSON = "findPerson";
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column
	private String name;
	
	private int age;
	
	public Person() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}	
	
}
