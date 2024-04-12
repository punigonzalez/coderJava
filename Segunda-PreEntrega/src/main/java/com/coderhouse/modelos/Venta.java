package com.coderhouse.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table (name="Ventas")

	public class Venta {
		
		@Id
		@Column(name="ID VENTA")
		private Integer id_venta;
		@Column(name="TOTAL GASTADO")
		private float totalGastado;
		
		
		@OneToOne
	    @JoinColumn(name = "NUMERO_DE_COMPRA", referencedColumnName = "ID COMPRA")
	    private Cliente cliente;
		
		
		
		public Venta() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Integer getId_venta() {
			return id_venta;
		}


		public void setId_venta(Integer id_venta) {
			this.id_venta = id_venta;
		}


		public float getTotalGastado() {
			return totalGastado;
		}


		public void setTotalGastado(float totalGastado) {
			this.totalGastado = totalGastado;
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
