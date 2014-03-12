package br.com.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;

import br.com.dao.interfaces.GenericDAO;

public abstract class HibernateDAO<T, Type extends Serializable> implements GenericDAO<T, Type> {

	private Class<T> persistentClass;

	public HibernateDAO(Class persistentClass) {
		super();
		this.persistentClass = persistentClass;
	}

	@Override
	public void beginTransaction() {
		HibernateUtil.beginTransaction();
	}

	@Override
	public void commitTransaction() {
		HibernateUtil.commitTransaction();
	}

	@Override
	public void save(T entity) {
		HibernateUtil.getSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(T entity) {
		HibernateUtil.getSession().delete(entity);
	}

	@Override
	public List<T> listAll() {
		HibernateUtil.beginTransaction();
		Criteria criteria = HibernateUtil.getSession().createCriteria(persistentClass);
		return criteria.list();
	}

}