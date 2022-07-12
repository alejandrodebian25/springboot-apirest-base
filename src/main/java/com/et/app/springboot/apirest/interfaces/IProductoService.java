package com.et.app.springboot.apirest.interfaces;

import java.util.List;

import com.et.app.springboot.apirest.entities.Producto;

public interface IProductoService {

    public List<Producto> findAll();

    public Producto findById(Long id);
}
