package com.coderhouse.entidades;




import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Clientes")

public class Cliente {
	@Id
	private Integer  cli_id;// id de cliente ligado a otra tabla con nombres de cada cliente
	private String cli_razonSocial; 
	private String cli_domicilio; 
	private String cli_email;
	private Integer cli_telefono;
	
	
	
	
	public Cliente() {
		super();
	}
	
	
	
	
	public Integer getCli_id() {
		return cli_id;
	}
	public void setCli_id(Integer cli_id) {
		this.cli_id = cli_id;
	}
	public String getCli_razonSocial() {
		return cli_razonSocial;
	}
	public void setCli_razonSocial(String cli_razonSocial) {
		this.cli_razonSocial = cli_razonSocial;
	}
	public String getCli_domicilio() {
		return cli_domicilio;
	}
	public void setCli_domicilio(String cli_domicilio) {
		this.cli_domicilio = cli_domicilio;
	}
	public String getCli_email() {
		return cli_email;
	}
	public void setCli_email(String cli_email) {
		this.cli_email = cli_email;
	}
	public Integer getCli_telefono() {
		return cli_telefono;
	}
	public void setCli_telefono(Integer cli_telefono) {
		this.cli_telefono = cli_telefono;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
