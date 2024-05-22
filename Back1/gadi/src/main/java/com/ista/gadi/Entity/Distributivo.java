package com.ista.gadi.Entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="distributivo", uniqueConstraints= {@UniqueConstraint(columnNames= {"id_distributivo","id_persona","id_periodo"})})
public class Distributivo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_distributivo;
	private Long id_persona;
	private Long id_periodo;
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="id_distributivo")
	private List<Distributivo_Actividad>Distributivo_Actividad;
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="id_distributivo")
	private List<Distributivo_Asignatura>Distributivo_Asignatura;

	public Long getId_distributivo() {
		return id_distributivo;
	}
	public void setId_distributivo(Long id_distributivo) {
		this.id_distributivo = id_distributivo;
	}
	public Long getId_persona() {
		return id_persona;
	}
	public void setId_persona(Long id_persona) {
		this.id_persona = id_persona;
	}

	public Long getId_periodo() {
		return id_periodo;
	}
	public void setId_periodo(Long id_periodo) {
		this.id_periodo = id_periodo;
	}


}
