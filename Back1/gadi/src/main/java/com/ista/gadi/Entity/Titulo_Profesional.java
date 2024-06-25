package com.ista.gadi.Entity;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name="titulo_profesional", uniqueConstraints= {@UniqueConstraint(columnNames= {"id_titulo_profesional","id_persona"})})
public class Titulo_Profesional implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_titulo_profesional;
	
	private String nombre_titulo;
	private String grado;
	private Long id_persona;
	public Long getId_persona() {
		return id_persona;
	}
	public void setId_persona(Long id_persona) {
		this.id_persona = id_persona;
	}
	public Long getId_titulo_profesional() {
		return id_titulo_profesional;
	}
	public void setId_titulo_profesional(Long id_titulo_profesional) {
		this.id_titulo_profesional = id_titulo_profesional;
	}
	public String getNombre_titulo() {
		return nombre_titulo;
	}
	public void setNombre_titulo(String nombre_titulo) {
		this.nombre_titulo = nombre_titulo;
	}
	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}
	
}