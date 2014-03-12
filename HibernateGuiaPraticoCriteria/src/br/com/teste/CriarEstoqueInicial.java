package br.com.teste;

import java.util.Scanner;

import br.com.bean.Estoque;
import br.com.dao.EstoqueDAO;

public class CriarEstoqueInicial {

	public static void main(String[] args) {

		EstoqueDAO estoqueDAO = new EstoqueDAO();
		for (int i = 1; i <= 100; i++) {
			Estoque estoque = new Estoque(i, "nome produto " + i, 10 * i, 0.12 * i);
			estoqueDAO.salvar(estoque);
		}

	}

}
