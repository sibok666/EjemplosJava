package com.itpro.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.itpro.dao.GenericDAO;
import com.itpro.model.Usuario;

@Repository
public abstract class GenericDAOImpl<E, PK extends Serializable> extends HibernateDaoSupport implements GenericDAO<E, PK>{
   
    protected Class<? extends E> daoType;
    
    
    @Autowired
	public void init(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}
    
    public GenericDAOImpl(){
    	
    	ParameterizedType pType = (ParameterizedType) getClass().getGenericSuperclass();
    	this.daoType = (Class<E>) pType.getActualTypeArguments()[0];
    }
    
	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
	public void add(E entity) {
		getHibernateTemplate().save(entity);
		
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
	public void saveOrUpdate(E entity) {
		getHibernateTemplate().saveOrUpdate(entity);
		
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
	public void update(E entity) {
		getHibernateTemplate().update(entity);
		
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
	public void remove(E entity) {
		getHibernateTemplate().delete(entity);
		
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
	public E find(PK key) {
		return (E) getHibernateTemplate().getSessionFactory().getCurrentSession().get(daoType, key);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)
	public List<E> getAll() {
		
		return getHibernateTemplate().getSessionFactory().getCurrentSession().createCriteria(daoType).list();
	}
    
}

