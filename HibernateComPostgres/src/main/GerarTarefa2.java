package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GerarTarefa2 {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		for (Integer i = 0; i <= 10000; i++) {

			Tarefa2 tarefa2 = new Tarefa2();
			tarefa2.descricao01 = "campo de descricao de strings 255 caracteres";
			tarefa2.descricao02 = "campo de descricao de strings 255 caracteres";
			tarefa2.descricao03 = "campo de descricao de strings 255 caracteres";
			tarefa2.descricao04 = "campo de descricao de strings 255 caracteres";
			tarefa2.descricao05 = "campo de descricao de strings 255 caracteres";
			tarefa2.descricao06 = "campo de descricao de strings 255 caracteres";
			tarefa2.descricao07 = "campo de descricao de strings 255 caracteres";
			tarefa2.descricao08 = "campo de descricao de strings 255 caracteres";
			tarefa2.descricao09 = "campo de descricao de strings 255 caracteres";
			tarefa2.descricao10 = "campo de descricao de strings 255 caracteres";
			tarefa2.numerico01 = (double) 1234567890;
			tarefa2.numerico02 = (double) 1234567890;
			tarefa2.numerico03 = (double) 1234567890;
			tarefa2.numerico04 = (double) 1234567890;
			tarefa2.numerico05 = (double) 1234567890;
			tarefa2.numerico06 = (double) 1234567890;
			tarefa2.numerico07 = (double) 1234567890;
			tarefa2.numerico08 = (double) 1234567890;
			tarefa2.numerico09 = (double) 1234567890;
			tarefa2.numerico10 = (double) 1234567890;
			tarefa2.decimal01 =  (float) 1234567890.0000012345;

			manager.persist(tarefa2);

			System.out.println("ID da tarefa: " + tarefa2.id);

		}
		manager.getTransaction().commit();
		manager.close();
		factory.close();

	}

}
