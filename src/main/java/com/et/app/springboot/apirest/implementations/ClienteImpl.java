package com.et.app.springboot.apirest.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.et.app.springboot.apirest.dao.IClienteDao;
import com.et.app.springboot.apirest.entities.Cliente;
import com.et.app.springboot.apirest.interfaces.IClienteService;
@Service
public class ClienteImpl implements IClienteService {

    @Autowired
    IClienteDao clienteDao;

    @Transactional(readOnly = true)
    @Override
    public List<Cliente> findAll() {
        return clienteDao.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Cliente findById(Long id) {
        return clienteDao.findById(id).orElse(null);
    }

}
