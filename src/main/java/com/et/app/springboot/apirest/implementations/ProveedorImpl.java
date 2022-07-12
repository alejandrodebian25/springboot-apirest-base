package com.et.app.springboot.apirest.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.et.app.springboot.apirest.dao.IProveedorDao;
import com.et.app.springboot.apirest.entities.Proveedor;
import com.et.app.springboot.apirest.interfaces.IProveedorService;

@Service
public class ProveedorImpl implements IProveedorService {

    @Autowired
    IProveedorDao proveedorDao;

    @Override
    public List<Proveedor> findAll() {
        return proveedorDao.findAll();
    }

    @Override
    public Proveedor findById(Long id) {
        return proveedorDao.findById(id).orElse(null);
    }

}
