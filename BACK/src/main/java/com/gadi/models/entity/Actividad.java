package com.gadi.models.entity;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name="actividad", uniqueConstraints= {@UniqueConstraint(columnNames= {"id_actividad","id_tipo_actividad"})})
public class Actividad implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_actividad;
	
	private String nombre_Actividad;
	private String descripcion_actividad;
	private int horas_no_docentes;
	
	private int id_tipo_actividad;

	public int getId_actividad() {
		return id_actividad;
	}

	public void setId_actividad(int id_actividad) {
		this.id_actividad = id_actividad;
	}

	public String getNombre_Actividad() {
		return nombre_Actividad;
	}

	public void setNombre_Actividad(String nombre_Actividad) {
		this.nombre_Actividad = nombre_Actividad;
	}

	public String getDescripcion_actividad() {
		return descripcion_actividad;
	}

	public void setDescripcion_actividad(String descripcion_actividad) {
		this.descripcion_actividad = descripcion_actividad;
	}

	public int getHoras_no_docentes() {
		return horas_no_docentes;
	}

	public void setHoras_no_docentes(int horas_no_docentes) {
		this.horas_no_docentes = horas_no_docentes;
	}

	public int getId_tipo_actividad() {
		return id_tipo_actividad;
	}

	public void setId_tipo_actividad(int id_tipo_actividad) {
		this.id_tipo_actividad = id_tipo_actividad;
	}
	
}
