package com.coderhouse.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coderhouse.modelos.Cliente;



@Repository
public interface ClienteRepository extends JpaRepository <Cliente,Integer>{
	
	

}
