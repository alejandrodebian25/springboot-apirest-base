package com.et.app.springboot.apirest.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.et.app.springboot.apirest.dao.IProductoDao;
import com.et.app.springboot.apirest.entities.Producto;
import com.et.app.springboot.apirest.interfaces.IProductoService;
@Service
public class ProductoImpl implements IProductoService {

    @Autowired
    IProductoDao productoDao;

    @Override
    public List<Producto> findAll() {
        return productoDao.findAll();
    }

    @Override
    public Producto findById(Long id) {
        return productoDao.findById(id).orElse(null);
    }
}
