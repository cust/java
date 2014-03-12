package br.com.teste;

import br.com.bean.Automovel;
import br.com.dao.AutomovelDAO;

public class Criar100Automoveis {

	public static void main(String[] args) {

		AutomovelDAO automovelDAO = new AutomovelDAO();
		for (int i = 1; i <= 100; i++) {
			Automovel automovel = new Automovel(i, "nome carro " + i, 1980 + i, "fabricante" + 1 * 2);
			automovelDAO.salvar(automovel);
		}

	}

}
