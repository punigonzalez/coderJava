package com.coderhouse.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.coderhouse.modelos.Cliente;
import com.coderhouse.repositorios.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente agregarCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public Cliente mostrarClientePorId(Integer id) {  
		return clienteRepository.findById(id).orElse(null);
	}

	public Cliente editarClientePorId (Integer id, Cliente cliente) {
		try {
			if (clienteRepository.existsById(id)) {
				cliente.setDni(id);
				return clienteRepository.save(cliente);
			}
		} catch(EmptyResultDataAccessException e){
			return null;
			}
		return null;
		}
}