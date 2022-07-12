package com.et.app.springboot.apirest.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.et.app.springboot.apirest.dao.IDireccionDao;
import com.et.app.springboot.apirest.entities.Direccion;
import com.et.app.springboot.apirest.interfaces.IDireccionService;

@Service
public class DireccionImpl implements IDireccionService {
    
    @Autowired
    IDireccionDao direccionDao;

    @Override
    public List<Direccion> findAll() {
        return direccionDao.findAll();
    }

    @Override
    public Direccion findById(Long id) {
        return direccionDao.findById(id).orElse(null);
    }

}
