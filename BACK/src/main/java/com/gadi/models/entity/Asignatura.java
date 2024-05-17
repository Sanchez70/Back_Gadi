package com.gadi.models.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="asignatura", uniqueConstraints= {@UniqueConstraint(columnNames= {"id_asignatura","id_carrera","id_ciclo"})})
public class Asignatura implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_asignatura;
	
	private String nombre_asignatura;
	private int horas_semanales;
	
	private Long id_carrera;
	private Long id_ciclo;

	@JoinColumn(name="id_asignatura")
	private List<Distributivo_Asignatura>Distributivo_Asignatura;
	
	public Long getId_asignatura() {
		return id_asignatura;
	}

	public void setId_asignatura(Long id_asignatura) {
		this.id_asignatura = id_asignatura;
	}

	public String getNombre_asignatura() {
		return nombre_asignatura;
	}

	public void setNombre_asignatura(String nombre_asignatura) {
		this.nombre_asignatura = nombre_asignatura;
	}

	public int getHoras_semanales() {
		return horas_semanales;
	}

	public void setHoras_semanales(int horas_semanales) {
		this.horas_semanales = horas_semanales;
	}

	public Long getId_carrera() {
		return id_carrera;
	}

	public void setId_carrera(Long id_carrera) {
		this.id_carrera = id_carrera;
	}

	public Long getId_ciclo() {
		return id_ciclo;
	}

	public void setId_ciclo(Long id_ciclo) {
		this.id_ciclo = id_ciclo;
	}

	
	
	
}
