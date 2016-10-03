package com.ipartek.formacion.hibernate.pojo;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "persona")
public class Persona {

	@Id
	@GeneratedValue
	private Long id;

	@Basic
	@Column(name = "nombre")
	private String nombre;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_nacimiento")
	private Date fechaNacimiento;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [id=" + this.id + ", nombre=" + this.nombre + ", fechaNacimiento=" + this.fechaNacimiento + "]";
	}

}
