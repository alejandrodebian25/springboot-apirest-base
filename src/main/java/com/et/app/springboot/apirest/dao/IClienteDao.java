package com.et.app.springboot.apirest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.et.app.springboot.apirest.entities.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long> {

}
