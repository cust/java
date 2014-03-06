package main;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeraTabelas {

	public static void main(String[] args) {

		System.out.println("antes do erro");

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		factory.close();

	}

}
