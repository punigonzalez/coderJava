package com.coderhouse.modelos;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table (name="Productos")
public class Producto {
	
	@Column(name="NOMBRE")
	private String nombre;
	@Column(name="Categoria")
	private String categoria;
	@Column(name="Precio")
	private float precio;
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	
	
	
	
	

}