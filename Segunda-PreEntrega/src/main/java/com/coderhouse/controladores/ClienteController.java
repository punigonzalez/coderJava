package com.coderhouse.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderhouse.modelos.Cliente;
import com.coderhouse.servicios.ClienteService;

@RestController
@RequestMapping("/clientes")


public class ClienteController {
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping(value="/",produces= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<Cliente>> listarClientes(){
		try {
			List<Cliente> cliente = clienteService.listarClientes();
			return new ResponseEntity<>(cliente,HttpStatus.OK);
			
			
		}catch(Exception e) {
			return new ResponseEntity <>(HttpStatus.INTERNAL_SERVER_ERROR); // error 500
			
		}
	}
	
	@GetMapping(value="/{id}",produces= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Cliente> mostrarClientePorId(@PathVariable("id")Integer id){
		try {
			
			Cliente cliente = clienteService.mostrarClientePorId(id);
			if(cliente != null) {return new ResponseEntity<>(cliente,HttpStatus.OK);
			} else {
				return new ResponseEntity<>(cliente, HttpStatus.NOT_FOUND);}   //  error 404
			
		}catch(Exception e) {
			return new ResponseEntity <>(HttpStatus.INTERNAL_SERVER_ERROR); // error 500
			
		}
	}
	
	
	@PostMapping (value="/agregarCliente",consumes = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity <Cliente> agregarCliente( @RequestBody Cliente cliente){
		clienteService.agregarCliente(cliente);
		return new ResponseEntity<>(cliente,HttpStatus.CREATED);
	}	
	
	@DeleteMapping(value= "/{id}/eliminar")
	public ResponseEntity<Void> eliminarProducto(@PathVariable("id") Integer id){
		boolean eliminado = clienteService.elimarClientePorId(id);
		if (eliminado) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT)	;		// código 204
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);         // error 404
		}}
	
	
	
}
