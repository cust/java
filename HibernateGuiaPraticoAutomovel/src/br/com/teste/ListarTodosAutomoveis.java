package br.com.teste;

import java.util.List;

import br.com.bean.Automovel;
import br.com.dao.AutomovelDAO;

public class ListarTodosAutomoveis {

	public static void main(String[] args) {
		exibirTudo();
	}

	public static void exibirTudo() {
		AutomovelDAO automovelDAO = new AutomovelDAO();
		List<Automovel> listaAutomoveis = automovelDAO.getTodos();
		for (Automovel automovel : listaAutomoveis) {
			System.out.println(automovel.getNome());
		}
	}

}
