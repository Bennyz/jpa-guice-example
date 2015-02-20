package io.benny.jpa.guice.jpa;

import com.google.inject.Inject;
import com.google.inject.persist.PersistService;

public class JpaInitializer {
	
	@Inject
	public JpaInitializer(PersistService p) {
		p.start();
	}
	
}
