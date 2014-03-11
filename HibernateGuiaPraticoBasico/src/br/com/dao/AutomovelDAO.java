package br.com.dao;

import org.hibernate.HibernateException;

import br.com.bean.Automovel;

public class AutomovelDAO extends DAO {

	public AutomovelDAO() {
		// TODO Auto-generated constructor stub
	}

	public void salvar(Automovel automovel) {
		begin();
		getSession().save(automovel);
		try {
			commit();
			System.out.println("Automovel cadastrado com sucesso!");
		} catch (HibernateException e) {
			rollback();
		}
	}

}
