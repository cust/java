package br.com.dao;

import br.com.bean.Client;
import br.com.dao.interfaces.ClientDAO;

public class HibernateClientDAO extends HibernateDAO<Client, Long> implements ClientDAO {

	public HibernateClientDAO() {
		// we passing the entity for super class
		super(Client.class);
	}
}
