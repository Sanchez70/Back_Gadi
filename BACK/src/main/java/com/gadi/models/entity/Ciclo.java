package com.gadi.models.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name="ciclo", uniqueConstraints= {@UniqueConstraint(columnNames= {"id_articulo","codigo"})})
public class Ciclo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_ciclo;
	
	private String nombre_ciclo;

	public int getId_ciclo() {
		return id_ciclo;
	}

	public void setId_ciclo(int id_ciclo) {
		this.id_ciclo = id_ciclo;
	}

	public String getNombre_ciclo() {
		return nombre_ciclo;
	}

	public void setNombre_ciclo(String nombre_ciclo) {
		this.nombre_ciclo = nombre_ciclo;
	}

}
