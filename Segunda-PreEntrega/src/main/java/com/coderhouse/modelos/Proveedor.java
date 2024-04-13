package com.coderhouse.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="Proveedores")

public class Proveedor {
	@Id
	@Column(name="ID PROVEEDOR")
	private Integer id_proveedor;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@OneToOne
    @JoinColumn(name = "ID PROVEEDOR", referencedColumnName = "ID_PROVEEDOR")
    private Producto producto;


	public Proveedor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getId_proveedor() {
		return id_proveedor;
	}


	public void setId_proveedor(Integer id_proveedor) {
		this.id_proveedor = id_proveedor;
	}


	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	
	
	
	
	
	
	
	
	}

	
	
	
	
	
	
	
	
	
	
	
	

