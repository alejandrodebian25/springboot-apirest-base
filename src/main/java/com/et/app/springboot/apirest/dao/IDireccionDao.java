package com.et.app.springboot.apirest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.et.app.springboot.apirest.entities.Direccion;

public interface IDireccionDao extends JpaRepository<Direccion, Long> {

}
