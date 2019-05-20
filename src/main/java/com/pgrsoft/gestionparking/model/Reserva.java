package com.pgrsoft.gestionparking.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="RESERVAS")
public class Reserva implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@TableGenerator(name="RESERVAS_GENERATOR",
					table="SECUENCIAS",
					pkColumnName = "SEQ_NAME",
					pkColumnValue= "RESERVAS_SEQ",
					valueColumnName = "SEQ_NUMBER",
					allocationSize = 10)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "RESERVAS_GENERATOR")
	private Long codigo;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="codigo_usuario")
	private Usuario usuario;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="codigo_plaza")
	private Plaza palza;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_INI")
	private Date inicio;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_FIN")
	private Date fin;
	
	public Reserva() {
		
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Plaza getPalza() {
		return palza;
	}

	public void setPalza(Plaza palza) {
		this.palza = palza;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFin() {
		return fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}
	
	
}
