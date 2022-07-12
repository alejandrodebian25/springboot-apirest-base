package com.et.app.springboot.apirest.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name = "productos")
@Data
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "producto_id")
    private Long productoId;

    @Column(name = "codigo_producto", unique = true)
    private String codigoProducto;

    @Column(name = "nombre_producto")
    private String nombreProducto;

    /* Relations Proveedor 1:N Productos */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "proveedor_id", nullable = false)
    @JsonIgnore
    private Proveedor proveedor;

    /* Relations Clientes N:N Productos */
    @OneToMany(mappedBy = "producto")
    private Set<ClienteProducto> clienteProductos;

}
