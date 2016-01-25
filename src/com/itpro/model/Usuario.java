package com.itpro.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name="usuario")
public class Usuario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6752998604934754462L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int idUsuario;
	
	@Column
	private String usuario;
	
	@Column
	private String password;
	
	@Column
	private int estatus;
	
	
	////getters y setters
	public int getId() {
		return idUsuario;
	}
	public void setId(int id) {
		this.idUsuario = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getEstatus() {
		return estatus;
	}
	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}
	
}
