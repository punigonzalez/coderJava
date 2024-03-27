package com.coderhouse.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table (name = "Ventas")

public class Venta {
	private Integer cli_id; // numero que coincida con el id del cliente a quien se le vendio
	private Integer nroFactura; 
	private float total; 
	private Integer nroVenta;
	
	
	public Venta() {
		super();		
	}


	public Integer getCli_id() {
		return cli_id;
	}


	public void setCli_id(Integer cli_id) {
		this.cli_id = cli_id;
	}


	public Integer getNroFactura() {
		return nroFactura;
	}


	public void setNroFactura(Integer nroFactura) {
		this.nroFactura = nroFactura;
	}


	public float getTotal() {
		return total;
	}


	public void setTotal(float total) {
		this.total = total;
	}


	public Integer getNroVenta() {
		return nroVenta;
	}


	public void setNroVenta(Integer nroVenta) {
		this.nroVenta = nroVenta;
	}
	
	
	
	

}
