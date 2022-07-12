package com.et.app.springboot.apirest.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.et.app.springboot.apirest.entities.Cliente;
import com.et.app.springboot.apirest.interfaces.IClienteService;

@RestController
@RequestMapping(value = "/api/clientes")
public class ClienteController {

    @Autowired
    IClienteService clienteService;
    @GetMapping
    public ResponseEntity<?> index() {
        Map<String, Object> respuesta = new HashMap<>();
        List<Cliente> clientes = clienteService.findAll();
        if (!clientes.isEmpty()) {
            respuesta.put("mensaje", "OK");
            respuesta.put("data", clientes);

        } else {
            respuesta.put("mensaje", "SIN REGISTROS");
            respuesta.put("data", "No existen clientes");
        }
        return new ResponseEntity<Map<String, Object>>(respuesta, HttpStatus.OK);
        // return null;
    }
}
