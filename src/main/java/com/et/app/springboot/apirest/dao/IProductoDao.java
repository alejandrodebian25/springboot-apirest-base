package com.et.app.springboot.apirest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.et.app.springboot.apirest.entities.Producto;

public interface IProductoDao extends JpaRepository<Producto, Long> {

}
