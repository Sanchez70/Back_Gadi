package com.gadi.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="distributivo_asignatura", uniqueConstraints= {@UniqueConstraint(columnNames= {"id_distributivo_asig","id_distributivo","id_asignatura","id_jornada"})})
public class Distributivo_Asignatura implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id_distributivo_asig;
	private Long id_distributivo;
	private Long id_asignatura;
	private String paralelo;
	private Long id_jornada;
	public Long getId_distributivo_asig() {
		return id_distributivo_asig;
	}
	public void setId_distributivo_asig(Long id_distributivo_asig) {
		this.id_distributivo_asig = id_distributivo_asig;
	}
	public Long getId_distributivo() {
		return id_distributivo;
	}
	public void setId_distributivo(Long id_distributivo) {
		this.id_distributivo = id_distributivo;
	}
	public Long getId_asignatura() {
		return id_asignatura;
	}
	public void setId_asignatura(Long id_asignatura) {
		this.id_asignatura = id_asignatura;
	}
	public String getParalelo() {
		return paralelo;
	}
	public void setParalelo(String paralelo) {
		this.paralelo = paralelo;
	}
	public Long getId_jornada() {
		return id_jornada;
	}
	public void setId_jornada(Long id_jornada) {
		this.id_jornada = id_jornada;
	}
	

}
