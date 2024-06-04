package com.ista.gadi.Entity;

import java.io.Serializable;
import java.util.List;

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
	private Long id_actividad;
	private String nombre_actividad;
	private String descripcion_actividad;
	private int horas_no_docentes;
	private Long id_tipo_actividad;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="id_actividad")
	private List<Distributivo_Actividad>Distributivo_Actividad;

	public Long getId_actividad() {
		return id_actividad;
	}

	public void setId_actividad(Long id_actividad) {
		this.id_actividad = id_actividad;
	}

	public List<Distributivo_Actividad> getDistributivo_Actividad() {
		return Distributivo_Actividad;
	}

	public void setDistributivo_Actividad(List<Distributivo_Actividad> distributivo_Actividad) {
		Distributivo_Actividad = distributivo_Actividad;
	}


	public String getNombre_actividad() {
		return nombre_actividad;
	}

	public void setNombre_actividad(String nombre_actividad) {
		this.nombre_actividad = nombre_actividad;
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

	public Long getId_tipo_actividad() {
		return id_tipo_actividad;
	}

	public void setId_tipo_actividad(Long id_tipo_actividad) {
		this.id_tipo_actividad = id_tipo_actividad;
	}


	
}
