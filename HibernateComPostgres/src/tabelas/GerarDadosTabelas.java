package tabelas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GerarDadosTabelas {
	
	public static void gerarDados(EntityManager manager, Tabela tabela) {
		
	}
	

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		for (Integer i = 0; i <= 10000; i++) {

			Tabela01 tabela = new Tabela01();
			tabela.descricao01 = "campo de descricao de strings 255 caracteres";
			tabela.descricao02 = "campo de descricao de strings 255 caracteres";
			tabela.descricao03 = "campo de descricao de strings 255 caracteres";
			tabela.descricao04 = "campo de descricao de strings 255 caracteres";
			tabela.descricao05 = "campo de descricao de strings 255 caracteres";
			tabela.descricao06 = "campo de descricao de strings 255 caracteres";
			tabela.descricao07 = "campo de descricao de strings 255 caracteres";
			tabela.descricao08 = "campo de descricao de strings 255 caracteres";
			tabela.descricao09 = "campo de descricao de strings 255 caracteres";
			tabela.descricao10 = "campo de descricao de strings 255 caracteres";
			tabela.double01 = (double) 1234567890;
			tabela.double02 = (double) 1234567890;
			tabela.double03 = (double) 1234567890;
			tabela.double04 = (double) 1234567890;
			tabela.double05 = (double) 1234567890;
			tabela.double06 = (double) 1234567890;
			tabela.double07 = (double) 1234567890;
			tabela.double08 = (double) 1234567890;
			tabela.double09 = (double) 1234567890;
			tabela.double10 = (double) 1234567890;
	 

			manager.persist(tabela);

			System.out.println("ID da tarefa: " + tabela.id);

		}
		manager.getTransaction().commit();
		manager.close();
		factory.close();

	}

}
