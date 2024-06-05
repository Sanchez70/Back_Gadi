package com.ista.gadi.Entity;

import java.io.Serializable;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="tipo_contrato", uniqueConstraints= {@UniqueConstraint(columnNames= {"id_tipo_contrato"})})
public class Tipo_Contrato implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_tipo_contrato;
	
	private String nombre_contrato;
	private Integer hora_contrato;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="id_tipo_contrato")
	private List<Persona>Persona;
	
	public Long getId_tipo_contrato() {
		return id_tipo_contrato;
	}
	public void setId_tipo_contrato(Long id_tipo_contrato) {
		this.id_tipo_contrato = id_tipo_contrato;
	}
	public String getNombre_contrato() {
		return nombre_contrato;
	}
	public void setNombre_contrato(String nombre_contrato) {
		this.nombre_contrato = nombre_contrato;
	}
	public Integer getHora_contrato() {
		return hora_contrato;
	}
	public void setHora_contrato(Integer hora_contrato) {
		this.hora_contrato = hora_contrato;
	}


	
}
