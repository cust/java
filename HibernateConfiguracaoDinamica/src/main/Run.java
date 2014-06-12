package main;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.empresa.Empresa;

public class Run {

	public static void main(String[] args) {
		criar();
	}

	// unico exemplo funcionando e nao alterar o percistense.xml
	public static void criar() {
		// http://stackoverflow.com/questions/1989672/create-entity-manager-without-persistence-xml
		// http://stackoverflow.com/questions/4106078/dynamic-jpa-connection
		Map<String, String> percistenceProperties = new HashMap<String, String>();
		percistenceProperties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		percistenceProperties.put("hibernate.connection.url", "jdbc:postgresql://localhost:5432/postgres");
		percistenceProperties.put("hibernate.connection.driver_class", "org.postgresql.Driver");
		percistenceProperties.put("hibernate.connection.username", "postgres");
		percistenceProperties.put("hibernate.connection.password", "hibernate");

		percistenceProperties.put("hibernate.hbm2ddl.auto", "update");
		percistenceProperties.put("hibernate.show_sql", "false");
		percistenceProperties.put("hibernate.format_sql", "false");
		percistenceProperties.put("hibernate.connection.autoReconnect", "true");
		percistenceProperties.put("hibernate.connection.autoReconnectForPools", "true");

		percistenceProperties.put("hibernate.c3p0.acquire_increment", "1");
		percistenceProperties.put("hibernate.c3p0.idle_test_period", "100");
		percistenceProperties.put("hibernate.c3p0.timeout", "100");
		percistenceProperties.put("hibernate.c3p0.max_size", "100");
		percistenceProperties.put("hibernate.c3p0.max_statement", "0");
		percistenceProperties.put("hibernate.c3p0.min_size", "10");

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("din", percistenceProperties);

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		for (Integer i = 0; i <= 1000; i++) {
			Empresa empresa = new Empresa();
			empresa.setDescricao("Estudar JPA");
			empresa.setFinalizado(true);
			empresa.setDataFinalizacao(Calendar.getInstance());

			entityManager.persist(empresa);

			System.out.println("ID da tarefa: " + empresa.getId());

		}
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();

	}
}
