package com.gadi.models.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name="grado_ocupacional", uniqueConstraints= {@UniqueConstraint(columnNames= {"id_grado_ocp",})})
public class Grado_Ocupacional implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_grado_ocp;
	
	private String nombre_grado_ocp;

	public Long getId_grado_ocp() {
		return id_grado_ocp;
	}

	public void setId_grado_ocp(Long id_grado_ocp) {
		this.id_grado_ocp = id_grado_ocp;
	}

	public String getNombre_grado_ocp() {
		return nombre_grado_ocp;
	}

	public void setNombre_grado_ocp(String nombre_grado_ocp) {
		this.nombre_grado_ocp = nombre_grado_ocp;
	}

}
