package com.coderhouse.controlador;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderhouse.modelos.Cliente;
import com.coderhouse.servicios.ClienteService;

@RestController
@RequestMapping("/cliente")


public class ClienteController {
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping (value="/agregar",consumes = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity <Cliente> agregarCliente( @RequestBody Cliente cliente){
		clienteService.agregarCliente(cliente);
		return new ResponseEntity<>(cliente,HttpStatus.CREATED);
	}
	
	@GetMapping(value="/{id}",produces= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Cliente> mostrarClientePorDni(@PathVariable("id") Integer dni) {
	    try {
	        Cliente cliente = clienteService.mostrarClientePorDni(dni);
	        if (cliente != null) {
	            // Calcular la edad del cliente
	            LocalDate fechaNacimiento = cliente.getFechaNacimiento();
	            int edad = Period.between(fechaNacimiento, LocalDate.now()).getYears();
	            
	            // Establecer la edad calculada en el objeto Cliente
	            cliente.setEdad(edad);
	            
	            return new ResponseEntity<>(cliente, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // Error 404
	        }
	    } catch (Exception e) {
	        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); // Error 500
	    }
	}
	
	
}
