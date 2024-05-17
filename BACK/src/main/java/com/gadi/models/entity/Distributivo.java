package com.gadi.models.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name="distributivo", uniqueConstraints= {@UniqueConstraint(columnNames= {"id_distributivo","id_persona","id_asignatura","id_periodo"})})
public class Distributivo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_distributivo;
	private int id_persona;
	private int id_asignatura;
	private int id_periodo;
	
	public int getId_distributivo() {
		return id_distributivo;
	}
	public void setId_distributivo(int id_distributivo) {
		this.id_distributivo = id_distributivo;
	}
	public int getId_persona() {
		return id_persona;
	}
	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}
	public int getId_asignatura() {
		return id_asignatura;
	}
	public void setId_asignatura(int id_asignatura) {
		this.id_asignatura = id_asignatura;
	}
	public int getId_periodo() {
		return id_periodo;
	}
	public void setId_periodo(int id_periodo) {
		this.id_periodo = id_periodo;
	}

}
