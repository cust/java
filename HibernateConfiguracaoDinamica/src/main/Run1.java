package main;

import model.empresa.Empresa;
import model.empresa.Financeiro;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Run1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void criarConexao() {

		Configuration configuration = new Configuration();
		configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		configuration.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/postgres");
		configuration.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
		configuration.setProperty("hibernate.connection.username", "postgres");
		configuration.setProperty("hibernate.connection.password", "hibernate");

		configuration.setProperty("hibernate.hbm2ddl.auto", "update");
		configuration.setProperty("hibernate.show_sql", "false");
		configuration.setProperty("hibernate.format_sql", "false");
		configuration.setProperty("hibernate.connection.autoReconnect", "true");
		configuration.setProperty("hibernate.connection.autoReconnectForPools", "true");

		configuration.setProperty("hibernate.c3p0.acquire_increment", "1");
		configuration.setProperty("hibernate.c3p0.idle_test_period", "100");
		configuration.setProperty("hibernate.c3p0.timeout", "100");
		configuration.setProperty("hibernate.c3p0.max_size", "100");
		configuration.setProperty("hibernate.c3p0.max_statement", "0");
		configuration.setProperty("hibernate.c3p0.min_size", "10");

		configuration.addAnnotatedClass(Empresa.class);
		configuration.addAnnotatedClass(Financeiro.class);

		configuration.configure();

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// http://www.guj.com.br/java/206202-conexao-dinamica-com-hibernate-resolvido

		// http://www.guj.com.br/java/227574-annotationconfiguration-deprecated
		// http://www.guj.com.br/java/219912-pequena-duvida-com-annotationconfiguration-hibernate-resolvido

	}

}
