package com.coderhouse.modelos;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table (name="Productos")
public class Producto {
	
		
		@Column(name="NOMBRE")
		private String nombre;
		@Column(name="CATEGORIA")
		private String categoria;
		@Column(name="PRECIO")
		private float precio;
		@Id
		@Column(name = "ID_PROVEEDOR")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer ID_proveedor;
		
		@OneToOne(mappedBy = "producto", cascade = CascadeType.ALL)
	    private Proveedor proveedor ;
		
		
		
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


		public Integer getID_proveedor() {
			return ID_proveedor;
		}


		public void setID_proveedor(Integer iD_proveedor) {
			ID_proveedor = iD_proveedor;
		}


		public Proveedor getProveedor() {
			return proveedor;
		}


		public void setProveedor(Proveedor proveedor) {
			this.proveedor = proveedor;
		}


		
		
		
		
	
	
	
	
	
	

}