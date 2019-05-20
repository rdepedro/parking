package com.pgrsoft.gestionparking.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PLAZAS")
public class Plaza implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="codigo")
	private Long numero;
	
	@Enumerated(EnumType.STRING)
	private Planta planta;
	
	private String propietario;
	private String telefono;
	private String email;
	private boolean disponible;
	
	public Plaza() {
		
	}

	public final Long getNumero() {
		return numero;
	}

	public final void setNumero(Long numero) {
		this.numero = numero;
	}

	public final Planta getPlanta() {
		return planta;
	}

	public final void setPlanta(Planta planta) {
		this.planta = planta;
	}

	public final String getPropietario() {
		return propietario;
	}

	public final void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public final String getTelefono() {
		return telefono;
	}

	public final void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public final String getEmail() {
		return email;
	}

	public final void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Plaza [numero=" + numero + ", planta=" + planta + ", propietario=" + propietario + ", telefono="
				+ telefono + ", email=" + email + "]";
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
}
