package com.itpro.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.itpro.dao.UsuarioDAO;
import com.itpro.model.Usuario;

@Repository
public class UsuarioDAOImpl extends GenericDAOImpl<Usuario,Integer> implements UsuarioDAO{
		
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public List<Usuario> obtenerUsuarios() {
		
		List<Usuario> users=getAll();
		return getAll();
	}
	

}
