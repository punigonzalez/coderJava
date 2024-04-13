package com.coderhouse.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.coderhouse.modelos.Cliente;
import com.coderhouse.repositorios.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	
	
	private ClienteRepository clienteRepository;
	
	public List<Cliente> listarClientes(){
		return clienteRepository.findAll();
	}
	
	
	public Cliente agregarCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public Cliente mostrarClientePorId(Integer id) {  
		return clienteRepository.findById(id).orElse(null);
	}
	
	public boolean elimarClientePorId(Integer id) {
		try {
			clienteRepository.deleteById(id);
			return true;
		}catch (EmptyResultDataAccessException e) {
			return false;
		}}
	
	
	
	
}