package com.coderhouse.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.coderhouse.modelos.Producto;
import com.coderhouse.servicios.ProductoService;

public class ProductoController {
	@Autowired
	private ProductoService productoService;
	
	@PostMapping (value="/agregar",consumes = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity <Producto> agregarProducto( @RequestBody Producto producto){
		productoService.agregarProducto(producto);
		return new ResponseEntity<>(producto,HttpStatus.CREATED);

	}
}
