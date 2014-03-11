package br.com.teste;

import java.util.Scanner;

import br.com.bean.Automovel;
import br.com.dao.AutomovelDAO;

public class AutomovelMain {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		Automovel automovel = new Automovel();

		System.out.println("Informe o nome do Veículo");
		String nomeauto = leitura.nextLine();
		automovel.setNome(nomeauto);

		System.out.println("Informe o ano");
		int anoauto = leitura.nextInt();
		automovel.setAno(anoauto);

		System.out.println("informe o fabricante");
		String fabricanteauto = leitura.nextLine();
		automovel.setFabricantenome(fabricanteauto);

		AutomovelDAO automovelDAO = new AutomovelDAO();
		automovelDAO.salvar(automovel);

	}
}
