package com.et.app.springboot.apirest.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class ClienteProducto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int cantidad;

    @Column(name = "fecha_compra", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date fechaCompra;

    /* Relations Clientes N:N Productos */
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    Producto producto;
}
