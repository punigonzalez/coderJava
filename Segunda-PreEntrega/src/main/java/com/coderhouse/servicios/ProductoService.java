package com.coderhouse.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderhouse.modelos.Producto;
import com.coderhouse.repositorios.ProductoRepository;

@Service
public class ProductoService {
	
	@Autowired
	private ProductoRepository productoRepository;
	
	public List<Producto> listarProductos(){
		return productoRepository.findAll();
	}
	
	public Producto agregarProducto(Producto producto) {
		return productoRepository.save(producto);
	}
	
	


}