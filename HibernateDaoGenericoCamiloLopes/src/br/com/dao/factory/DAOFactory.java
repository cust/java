package br.com.dao.factory;

import br.com.dao.interfaces.AccountDAO;
import br.com.dao.interfaces.ClientDAO;

public abstract class DAOFactory {

	private static final Class FACTORY_CLASS = HibernateDAOFactory.class;

	public static DAOFactory getFactory() {
		try {
			return (DAOFactory) FACTORY_CLASS.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}
	}

	public abstract ClientDAO getClientDAO();

	public abstract AccountDAO getAccountDAO();

}