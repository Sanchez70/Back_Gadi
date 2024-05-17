package com.gadi.models.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name="rol", uniqueConstraints= {@UniqueConstraint(columnNames= {"id_rol"})})
public class Rol implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_rol;
	
	private String nombre_rol;

	public int getId_rol() {
		return id_rol;
	}

	public void setId_rol(int id_rol) {
		this.id_rol = id_rol;
	}

	public String getNombre_rol() {
		return nombre_rol;
	}

	public void setNombre_rol(String nombre_rol) {
		this.nombre_rol = nombre_rol;
	}
}
