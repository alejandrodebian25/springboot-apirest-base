package com.et.app.springboot.apirest.interfaces;

import java.util.List;

import com.et.app.springboot.apirest.entities.Direccion;

public interface IDireccionService {

    public List<Direccion> findAll();

    public Direccion findById(Long id);
}
