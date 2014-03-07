package tabelascomheranca;

import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GerarDadosTabelas {

	public static String getDescricao(Tabela tabela, Random randon) {
		return "Gerando Numero Randomico para String : " + randon.nextInt(10000) + " " + "campo de descricao de strings 255 caracteres [1]. "
				+ "campo de Descricao de strings 255 caracteres [2]. " + "campo de descricao de Strings 255 caracteres [3]. " + "campo de descricao de strings 255 CARACTERES [4].";
	}

	public static void gerarDados(EntityManager manager, Tabela tabela, Random randon) {
		tabela.descricao01 = getDescricao(tabela, randon);
		tabela.descricao02 = getDescricao(tabela, randon);
		tabela.descricao03 = getDescricao(tabela, randon);
		tabela.descricao04 = getDescricao(tabela, randon);
		tabela.descricao05 = getDescricao(tabela, randon);
		tabela.descricao06 = getDescricao(tabela, randon);
		tabela.descricao07 = getDescricao(tabela, randon);
		tabela.descricao08 = getDescricao(tabela, randon);
		tabela.descricao09 = getDescricao(tabela, randon);
		tabela.descricao10 = getDescricao(tabela, randon);

		tabela.double01 = randon.nextDouble() * 100000;
		tabela.double02 = randon.nextDouble() * 100000;
		tabela.double03 = randon.nextDouble() * 100000;
		tabela.double04 = randon.nextDouble() * 100000;
		tabela.double05 = randon.nextDouble() * 100000;
		tabela.double06 = randon.nextDouble() * 100000;
		tabela.double07 = randon.nextDouble() * 100000;
		tabela.double08 = randon.nextDouble() * 100000;
		tabela.double09 = randon.nextDouble() * 100000;
		tabela.double10 = randon.nextDouble() * 100000;

		tabela.float01 = randon.nextFloat();
		tabela.float02 = randon.nextFloat();
		tabela.float03 = randon.nextFloat();
		tabela.float04 = randon.nextFloat();
		tabela.float05 = randon.nextFloat();
		tabela.float06 = randon.nextFloat();
		tabela.float07 = randon.nextFloat();
		tabela.float08 = randon.nextFloat();
		tabela.float09 = randon.nextFloat();
		tabela.float10 = randon.nextFloat();

		tabela.boolean01 = randon.nextBoolean();
		tabela.boolean02 = randon.nextBoolean();
		tabela.boolean03 = randon.nextBoolean();
		tabela.boolean04 = randon.nextBoolean();
		tabela.boolean05 = randon.nextBoolean();
		tabela.boolean06 = randon.nextBoolean();
		tabela.boolean07 = randon.nextBoolean();
		tabela.boolean08 = randon.nextBoolean();
		tabela.boolean09 = randon.nextBoolean();
		tabela.boolean10 = randon.nextBoolean();

		tabela.date01 = new java.util.Date();
		tabela.date02 = new java.util.Date();
		tabela.date03 = new java.util.Date();
		tabela.date04 = new java.util.Date();
		tabela.date05 = new java.util.Date();
		tabela.date06 = new java.util.Date();
		tabela.date07 = new java.util.Date();
		tabela.date08 = new java.util.Date();
		tabela.date09 = new java.util.Date();
		tabela.date10 = new java.util.Date();

		tabela.integer01 = randon.nextInt(1000000000);
		tabela.integer02 = randon.nextInt(1000000000);
		tabela.integer03 = randon.nextInt(1000000000);
		tabela.integer04 = randon.nextInt(1000000000);
		tabela.integer05 = randon.nextInt(1000000000);
		tabela.integer06 = randon.nextInt(1000000000);
		tabela.integer07 = randon.nextInt(1000000000);
		tabela.integer08 = randon.nextInt(1000000000);
		tabela.integer09 = randon.nextInt(1000000000);
		tabela.integer10 = randon.nextInt(1000000000);

		manager.persist(tabela);

	}

	public static void main(String[] args) {
		Integer totalRegistros = 10000;
		Random randon = new Random(1234567890);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tabelas");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		System.out.println("gerando dados tabela01");
		for (Integer i = 0; i <= totalRegistros; i++) {
			Tabela01 tabela = new Tabela01();
			gerarDados(manager, tabela, randon);
		}
		manager.getTransaction().commit();

		manager.getTransaction().begin();
		System.out.println("gerando dados tabela02");
		for (Integer i = 0; i <= totalRegistros; i++) {
			Tabela02 tabela = new Tabela02();
			gerarDados(manager, tabela, randon);
		}
		manager.getTransaction().commit();

		manager.getTransaction().begin();
		System.out.println("gerando dados tabela03");
		for (Integer i = 0; i <= totalRegistros; i++) {
			Tabela03 tabela = new Tabela03();
			gerarDados(manager, tabela, randon);
		}
		manager.getTransaction().commit();

		manager.getTransaction().begin();
		System.out.println("gerando dados tabela04");
		for (Integer i = 0; i <= totalRegistros; i++) {
			Tabela04 tabela = new Tabela04();
			gerarDados(manager, tabela, randon);
		}
		manager.getTransaction().commit();

		manager.getTransaction().begin();
		System.out.println("gerando dados tabela05");
		for (Integer i = 0; i <= totalRegistros; i++) {
			Tabela05 tabela = new Tabela05();
			gerarDados(manager, tabela, randon);
		}
		manager.getTransaction().commit();

		manager.getTransaction().begin();
		System.out.println("gerando dados tabela06");
		for (Integer i = 0; i <= totalRegistros; i++) {
			Tabela06 tabela = new Tabela06();
			gerarDados(manager, tabela, randon);
		}
		manager.getTransaction().commit();

		manager.getTransaction().begin();
		System.out.println("gerando dados tabela07");
		for (Integer i = 0; i <= totalRegistros; i++) {
			Tabela07 tabela = new Tabela07();
			gerarDados(manager, tabela, randon);
		}
		manager.getTransaction().commit();

		manager.getTransaction().begin();
		System.out.println("gerando dados tabela08");
		for (Integer i = 0; i <= totalRegistros; i++) {
			Tabela08 tabela = new Tabela08();
			gerarDados(manager, tabela, randon);
		}
		manager.getTransaction().commit();

		manager.getTransaction().begin();
		System.out.println("gerando dados tabela09");
		for (Integer i = 0; i <= totalRegistros; i++) {
			Tabela09 tabela = new Tabela09();
			gerarDados(manager, tabela, randon);
		}
		manager.getTransaction().commit();

		manager.getTransaction().begin();
		System.out.println("gerando dados tabela10");
		for (Integer i = 0; i <= totalRegistros; i++) {
			Tabela10 tabela = new Tabela10();
			gerarDados(manager, tabela, randon);
		}
		manager.getTransaction().commit();
		System.out.println("terminado!!!");

		manager.close();
		factory.close();
	}

}
