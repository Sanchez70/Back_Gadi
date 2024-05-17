package com.gadi.models.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name="carrera", uniqueConstraints= {@UniqueConstraint(columnNames= {"id_carrera"})})
public class Carrera implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_carrera;
	
	private String nombre_carrera;
	private Date fecha_inicio;
	private int horas_semanales;
	private String codigo;
	public int getId_carrera() {
		return id_carrera;
	}
	public void setId_carrera(int id_carrera) {
		this.id_carrera = id_carrera;
	}
	public String getNombre_carrera() {
		return nombre_carrera;
	}
	public void setNombre_carrera(String nombre_carrera) {
		this.nombre_carrera = nombre_carrera;
	}
	public Date getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public int getHoras_semanales() {
		return horas_semanales;
	}
	public void setHoras_semanales(int horas_semanales) {
		this.horas_semanales = horas_semanales;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
}
