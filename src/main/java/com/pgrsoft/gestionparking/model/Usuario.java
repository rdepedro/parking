package com.pgrsoft.gestionparking.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USUARIOS")
public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="codigo")
	private Long id;
	private String nombre;
	private String apellido1;
	private String apellido2;
	
	public Usuario() {
		
	}

	public final Long getId() {
		return id;
	}

	public final void setId(Long id) {
		this.id = id;
	}

	public final String getNombre() {
		return nombre;
	}

	public final void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public final String getApellido1() {
		return apellido1;
	}

	public final void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public final String getApellido2() {
		return apellido2;
	}

	public final void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ "]";
	}
	
}
