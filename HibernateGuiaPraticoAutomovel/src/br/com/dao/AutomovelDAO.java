package br.com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;

import br.com.bean.Automovel;

public class AutomovelDAO extends DAO {

	public AutomovelDAO() {
		// TODO Auto-generated constructor stub
	}

	public void salvar(Automovel automovel) {
		System.out.println("iniciando");
		begin();
		System.out.println("iniciado");
		getSession().save(automovel);
		try {
			System.out.println("commitando");
			commit();
			System.out.println("commitado");
			System.out.println("Automovel cadastrado com sucesso!");
		} catch (HibernateException e) {
			System.out.println("erro! rollback");
			rollback();
		}
	}

	/* adicionado metodo para listar que nao existia inicialmente no projeto */

	public List<Automovel> getTodos() {
		Criteria crit = getSession().createCriteria(Automovel.class);
		List<Automovel> lista = crit.list();
		return lista;
	}

}
