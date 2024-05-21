package com.ista.gadi.Entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="ciclo", uniqueConstraints= {@UniqueConstraint(columnNames= {"id_ciclo"})})
public class Ciclo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_ciclo;
	
	private String nombre_ciclo;

	@JoinColumn(name="id_ciclo")
	private List<Asignatura>Asignatura;

	public Long getId_ciclo() {
		return id_ciclo;
	}

	public void setId_ciclo(Long id_ciclo) {
		this.id_ciclo = id_ciclo;
	}

	public String getNombre_ciclo() {
		return nombre_ciclo;
	}

	public void setNombre_ciclo(String nombre_ciclo) {
		this.nombre_ciclo = nombre_ciclo;
	}

}
