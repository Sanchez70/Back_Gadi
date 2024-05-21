package com.ista.gadi.Entity;

import java.io.Serializable;
import java.util.Date;

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
	private Date hora_contrato;
	
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
	public Date getHora_contrato() {
		return hora_contrato;
	}
	public void setHora_contrato(Date hora_contrato) {
		this.hora_contrato = hora_contrato;
	}

	
}
