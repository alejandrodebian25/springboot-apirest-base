package com.et.app.springboot.apirest.interfaces;

import java.util.List;

import com.et.app.springboot.apirest.entities.Cliente;

public interface IClienteService {

    public List<Cliente> findAll();

    public Cliente findById(Long id);
}
