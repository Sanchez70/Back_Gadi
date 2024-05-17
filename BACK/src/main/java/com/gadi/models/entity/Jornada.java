package com.gadi.models.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="jornada", uniqueConstraints= {@UniqueConstraint(columnNames= {"id_jornada"})})
public class Jornada implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_jornada;
	
	private String descrip_jornada;
	@JoinColumn(name="id_jornada")
	private List<Distributivo_Asignatura>Distributivo_Asignatura;

	public Long getId_jornada() {
		return id_jornada;
	}

	public void setId_jornada(Long id_jornada) {
		this.id_jornada = id_jornada;
	}

	public String getDescrip_jornada() {
		return descrip_jornada;
	}

	public void setDescrip_jornada(String descrip_jornada) {
		this.descrip_jornada = descrip_jornada;
	}
	
}
