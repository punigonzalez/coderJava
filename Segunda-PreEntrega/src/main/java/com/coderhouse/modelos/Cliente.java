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
@Table (name="clientes")
public class Cliente {
	
	
	@Column(name="NOMBRE")
	private String nombre;
	@Column(name= "DNI")
	private Integer dni;
	@Column(name="APELLIDO")
	private String apellido;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_COMPRA")
	private Integer id_Compra;
	
	@OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL)
    private Venta venta;
	
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



	public Integer getDni() {
		return dni;
	}



	public void setDni(Integer dni) {
		this.dni = dni;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public Integer getId_Compra() {
		return id_Compra;
	}



	public void setId_Compra(Integer id_Compra) {
		this.id_Compra = id_Compra;
	}



	

	
	
	
	

}
