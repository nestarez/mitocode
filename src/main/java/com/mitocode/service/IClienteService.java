package com.mitocode.service;

import com.mitocode.model.Cliente;

public interface IClienteService extends ICRUD<Cliente>{
	
	Cliente listarClientePorUsuario(String nombre);

}
