package main;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Run4 {

	public static void main(String[] args) {

		// 2.2.2. Bootstrapping
		// http://docs.jboss.org/hibernate/entitymanager/3.6/reference/en/html/configuration.html

		// The map version is a set of overrides that will take precedence over
		// any properties defined in your persistence.xml files.

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");

		// or

		Map<String, Object> configOverrides = new HashMap<String, Object>();
		configOverrides.put("hibernate.hbm2ddl.auto", "create-drop");
		EntityManagerFactory programmaticEmf = Persistence.createEntityManagerFactory("manager1", configOverrides);

	}

}
