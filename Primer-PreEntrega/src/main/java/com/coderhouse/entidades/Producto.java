package com.coderhouse.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Productos")


public class Producto {
	@Id
	private Integer id;// id de prodcuto ligado a otra tabla con nombres de cada producto
	private char descripcion; 
	private float precio; 
	private String color;
	private float tamaño;
	
	public Producto() {
		super();
		}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public char getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(char descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getTamaño() {
		return tamaño;
	}

	public void setTamaño(float tamaño) {
		this.tamaño = tamaño;
	}
	
	
	
	
	


}
