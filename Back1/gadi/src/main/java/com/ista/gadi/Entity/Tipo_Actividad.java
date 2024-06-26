package com.ista.gadi.Entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="tipo_actividad", uniqueConstraints= {@UniqueConstraint(columnNames= {"id_tipo_actividad"})})
public class Tipo_Actividad implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_tipo_actividad;
	
	private String nom_tip_actividad;
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="id_tipo_actividad")
	private List<Actividad>Actividad;
	
	public Long getId_tipo_actividad() {
		return id_tipo_actividad;
	}

	public void setId_tipo_actividad(Long id_tipo_actividad) {
		this.id_tipo_actividad = id_tipo_actividad;
	}

	public String getNom_tip_actividad() {
		return nom_tip_actividad;
	}

	public void setNom_tip_actividad(String nom_tip_actividad) {
		this.nom_tip_actividad = nom_tip_actividad;
	}

}
