package com.coderhouse.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table (name = "Proveedores")

public class Proveedor {
	

	private String prov_nombre; 
	private float saldo;
	
	
	public Proveedor() {
		super();
	}
	
	
	public String getProv_nombre() {
		return prov_nombre;
	}
	public void setProv_nombre(String prov_nombre) {
		this.prov_nombre = prov_nombre;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	} 
	
	
	
	

}
