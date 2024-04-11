package com.coderhouse.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderhouse.modelos.Producto;



@Repository
public interface ProductoRepository extends JpaRepository <Producto,Integer>{
	
	

}
