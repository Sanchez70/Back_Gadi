package com.ista.gadi.Entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
@Entity
@Table(name="usuario", uniqueConstraints= {@UniqueConstraint(columnNames= {"id_usuario_rol","id_usuario","id_rol"})})
public class UsuarioRol implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_usuario_rol;
	private Long id_usuario;
	private Long id_rol;
	
	
	public Long getId_usuario_rol() {
		return id_usuario_rol;
	}
	public void setId_usuario_rol(Long id_usuario_rol) {
		this.id_usuario_rol = id_usuario_rol;
	}
	public Long getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}
	public Long getId_rol() {
		return id_rol;
	}
	public void setId_rol(Long id_rol) {
		this.id_rol = id_rol;
	}
	
	

}
