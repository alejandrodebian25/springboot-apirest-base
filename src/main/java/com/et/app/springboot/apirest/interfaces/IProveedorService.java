package com.et.app.springboot.apirest.interfaces;

import java.util.List;

import com.et.app.springboot.apirest.entities.Proveedor;

public interface IProveedorService {

    public List<Proveedor> findAll();

    public Proveedor findById( Long id );
}
