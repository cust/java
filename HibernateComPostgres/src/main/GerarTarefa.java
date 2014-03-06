package main;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GerarTarefa {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		for (Integer i = 0; i <= 100000; i++) {

			Tarefa tarefa = new Tarefa();
			tarefa.setDescricao("Estudar JPA");
			tarefa.setFinalizado(true);
			tarefa.setDataFinalizacao(Calendar.getInstance());

			manager.persist(tarefa);

			System.out.println("ID da tarefa: " + tarefa.getId());

		}
		manager.getTransaction().commit();
		manager.close();
		factory.close();

	}

}
