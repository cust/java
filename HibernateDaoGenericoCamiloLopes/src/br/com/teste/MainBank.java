package br.com.teste;

import java.math.BigDecimal;

import br.com.bean.Account;
import br.com.bean.Account.AccountType;
import br.com.bean.Client;
import br.com.dao.factory.DAOFactory;
import br.com.dao.interfaces.AccountDAO;
import br.com.dao.interfaces.ClientDAO;

public class MainBank {

	public static void main(String[] args) {
		// getting instance of the factory
		DAOFactory daoFactory = DAOFactory.getFactory();
		// getting intance of clientDAO and starting transaction
		daoFactory.getClientDAO().beginTransaction();
		ClientDAO clientDAO = daoFactory.getClientDAO();
		Client client = new Client();
		client.setName("Nome do Cliente");
		// creating object of the entity
		Account checkigAccount = new Account();
		checkigAccount.setAccountType(AccountType.CHECKING_ACCOUNT);
		// associate acocunt with the client
		checkigAccount.setClient(client);
		// money available in account
		checkigAccount.setBalance(BigDecimal.ONE);
		client.getAccount().add(checkigAccount);
		// saveing in hibernate session
		clientDAO.save(client);
		AccountDAO accountDAO = daoFactory.getAccountDAO();
		accountDAO.save(checkigAccount);
		// commit
		clientDAO.commitTransaction();
	}
}