package com.coderhouse.modelos;



@Entity
@Table (name="clientes")
public class Cliente {
	
	@Id
	@Column(name="NOMBRE")
	private String nombre;
	@Column(name="APELLIDO")
	private String apellido;
	
	
	

}
