package com.gadi.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
@Entity
@Table(name="distributivo_actividad", uniqueConstraints= {@UniqueConstraint(columnNames= {"id_distributivo_actividad","id_actividad","id_distributivo"})})
public class Distributivo_Actividad implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_distributivo_actividad;
	private Integer id_distributivo;
	private Integer id_actividad;
	private Integer hora_no_docente;
	
	public Integer getId_distributivo() {
		return id_distributivo;
	}
	public void setId_distributivo(Integer id_distributivo) {
		this.id_distributivo = id_distributivo;
	}
	public Integer getId_actividad() {
		return id_actividad;
	}
	public void setId_actividad(Integer id_actividad) {
		this.id_actividad = id_actividad;
	}
	public Integer getHora_no_docente() {
		return hora_no_docente;
	}
	public void setHora_no_docente(Integer hora_no_docente) {
		this.hora_no_docente = hora_no_docente;
	}
	
	
	

}
