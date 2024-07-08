package com.ista.gadi.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "persona", uniqueConstraints = { @UniqueConstraint(columnNames = { "id_persona", "cedula",
		"id_tipo_contrato", "id_grado_ocp" }) })
public class Persona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_persona;

	private String cedula;
	private String nombre1;
	private String nombre2;
	private String apellido1;
	private String apellido2;
	private String telefono;
	private String direccion;
	private String correo;
	private int edad;
	private Date fecha_vinculacion;
	private Long id_tipo_contrato;
	private Long id_grado_ocp;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_persona")
	private List<Distributivo> Distributivo;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_persona")
	private List<Usuario> Usuario;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_persona")
	private List<Titulo_Profesional> titulos;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "id_persona")
	private List<Rector> rector;
	
	public Long getId_persona() {
		return id_persona;
	}

	public void setId_persona(Long id_persona) {
		this.id_persona = id_persona;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Date getFecha_vinculacion() {
		return fecha_vinculacion;
	}

	public void setFecha_vinculacion(Date fecha_vinculacion) {
		this.fecha_vinculacion = fecha_vinculacion;
	}


	public Long getId_grado_ocp() {
		return id_grado_ocp;
	}

	public void setId_grado_ocp(Long id_grado_ocp) {
		this.id_grado_ocp = id_grado_ocp;
	}

	public Long getId_tipo_contrato() {
		return id_tipo_contrato;
	}

	public void setId_tipo_contrato(Long id_tipo_contrato) {
		this.id_tipo_contrato = id_tipo_contrato;
	}

}
