package com.itpro.mb;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;

import com.itpro.model.Usuario;
import com.itpro.services.UsuarioService;
import com.itpro.services.impl.UsuarioServiceImpl;


@ManagedBean(name="usuarioMB")
@ViewScoped
public class UsuarioMB implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4032350316327213985L;
	
	@ManagedProperty(value = "#{UsuarioServicio}")
	UsuarioService servicioUsuario;
	
	public UsuarioService getServicioUsuario() {
		return servicioUsuario;
	}

	public void setServicioUsuario(UsuarioService servicioUsuario) {
		this.servicioUsuario = servicioUsuario;
	}

	public List<Usuario> obtenerUsuarios(){
		
		return servicioUsuario.obtenerTodosLosUsuarios();
	
	}
	
}
