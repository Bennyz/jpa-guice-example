package io.benny.jpa.guice.main;

import io.benny.jpa.guice.dao.PersonDAO;
import io.benny.jpa.guice.dao.PersonDAOImpl;

import com.google.inject.AbstractModule;

public class ApplicationModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(PersonDAO.class).to(PersonDAOImpl.class);
	}

}
