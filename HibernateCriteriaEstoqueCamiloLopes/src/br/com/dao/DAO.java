package br.com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DAO {
	private static final ThreadLocal threadlocal = new ThreadLocal();
	private static final SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();

	public Session getSession() {
		Session session = (Session) threadlocal.get();
		if (session == null) {
			session = sessionfactory.openSession();
			threadlocal.set(session);
		}

		return session;
	}

	/* adicionado metodos para persistir dados que nao existiam neste exemplo */

	public void begin() {
		getSession().beginTransaction();
	}

	public void commit() {
		getSession().getTransaction().commit();
	}

	public void rollback() {
		getSession().getTransaction().rollback();
	}

	public void persistir(Object objeto) {
		getSession().save(objeto);
	}

	public void close() {
		getSession().clear();
		threadlocal.set(null);
	}
}
