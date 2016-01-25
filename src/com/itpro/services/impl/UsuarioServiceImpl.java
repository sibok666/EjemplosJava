package com.itpro.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itpro.dao.UsuarioDAO;
import com.itpro.model.Usuario;
import com.itpro.services.UsuarioService;

@Service(value="UsuarioServicio")
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	UsuarioDAO usuarioDAO;
	
	@Override
	public List<Usuario> obtenerTodosLosUsuarios() {
		// TODO Auto-generated method stub
		return usuarioDAO.obtenerUsuarios();
	}

}
