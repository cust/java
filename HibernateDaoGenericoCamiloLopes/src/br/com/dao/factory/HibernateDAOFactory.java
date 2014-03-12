package br.com.dao.factory;

import br.com.dao.HibernateAccountDAO;
import br.com.dao.HibernateClientDAO;
import br.com.dao.interfaces.AccountDAO;
import br.com.dao.interfaces.ClientDAO;

public class HibernateDAOFactory extends DAOFactory {

	@Override
	public ClientDAO getClientDAO() {
		return new HibernateClientDAO();
	}

	@Override
	public AccountDAO getAccountDAO() {
		return new HibernateAccountDAO();
	}

}
