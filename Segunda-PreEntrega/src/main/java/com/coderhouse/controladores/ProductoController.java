package com.coderhouse.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderhouse.modelos.Producto;
import com.coderhouse.servicios.ProductoService;

@RestController
@RequestMapping("/productos")


public class ProductoController {
	@Autowired
	private ProductoService productoService;
	
	@GetMapping(value="/",produces= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<Producto>> listarProductos(){
		try {
			List<Producto> producto = productoService.listarProductos();
			return new ResponseEntity<>(producto,HttpStatus.OK);
			
			
		}catch(Exception e) {
			return new ResponseEntity <>(HttpStatus.INTERNAL_SERVER_ERROR); // error 500
			}
	}
	
	@PostMapping (value="/agregarProducto",consumes = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity <Producto> agregarCliente( @RequestBody Producto producto){
		productoService.agregarProducto(producto);
		return new ResponseEntity<>(producto,HttpStatus.CREATED);
	}	
	
	
	
	
	
	
	

	}

