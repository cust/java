package br.com.dao;

import br.com.bean.Account;
import br.com.dao.interfaces.AccountDAO;

public class HibernateAccountDAO extends HibernateDAO<Account, Long> implements AccountDAO {

	public HibernateAccountDAO() {
		super(Account.class);
	}
}