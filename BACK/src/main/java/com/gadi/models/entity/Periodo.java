package com.gadi.models.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name="periodo", uniqueConstraints= {@UniqueConstraint(columnNames= {"id_periodo"})})
public class Periodo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_periodo;
	
	private String nombre_periodo;
	private Date inicio_periodo;
	private Date fin_periodo;
	public int getId_periodo() {
		return id_periodo;
	}
	public void setId_periodo(int id_periodo) {
		this.id_periodo = id_periodo;
	}
	public String getNombre_periodo() {
		return nombre_periodo;
	}
	public void setNombre_periodo(String nombre_periodo) {
		this.nombre_periodo = nombre_periodo;
	}
	public Date getInicio_periodo() {
		return inicio_periodo;
	}
	public void setInicio_periodo(Date inicio_periodo) {
		this.inicio_periodo = inicio_periodo;
	}
	public Date getFin_periodo() {
		return fin_periodo;
	}
	public void setFin_periodo(Date fin_periodo) {
		this.fin_periodo = fin_periodo;
	}
	
}