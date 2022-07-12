package com.et.app.springboot.apirest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.et.app.springboot.apirest.entities.Proveedor;

public interface IProveedorDao extends JpaRepository<Proveedor, Long> {

}
