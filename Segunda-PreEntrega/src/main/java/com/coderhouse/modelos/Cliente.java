package com.coderhouse.modelos;

import java.time.LocalDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table (name="clientes")
public class Cliente {
	
	
	@Column(name="NOMBRE")
	private String nombre;
	@Id
	@Column(name= "DNI")
	private Integer dni;
	@Column(name="APELLIDO")
	private String apellido;
	@Column(name="FECHA DE NACIMIENTO")
	private LocalDate fechaNacimiento;
	@Column (name= "EDAD")
	private Integer edad;
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
	

}
