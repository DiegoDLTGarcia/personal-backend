package com.proyecto.personal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleados")
public class Empleados {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idempleado;
	
	@Column(name="Nombre")
	private String Nombre;
	
	@Column(name="Apepaterno")
	private String Apepaterno;
	
	@Column(name="Apematerno")
	private String Apematerno;
	
	@Column(name="estatus")
	private int estatus;
	
	public Empleados() {
		
	}

	public Empleados(int idempleado, String nombre, String apepaterno, String apematerno, int estatus) {
		super();
		this.idempleado = idempleado;
		Nombre = nombre;
		Apepaterno = apepaterno;
		Apematerno = apematerno;
		this.estatus = estatus;
	}

	public int getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApepaterno() {
		return Apepaterno;
	}

	public void setApepaterno(String apepaterno) {
		Apepaterno = apepaterno;
	}

	public String getApematerno() {
		return Apematerno;
	}

	public void setApematerno(String apematerno) {
		Apematerno = apematerno;
	}

	public int getEstatus() {
		return estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}
	
	
	 

}
