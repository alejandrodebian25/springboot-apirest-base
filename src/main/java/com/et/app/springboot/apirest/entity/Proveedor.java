package com.et.app.springboot.apirest.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "proveedores")
@Data
public class Proveedor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "proveedor_id")
    private Long proveedorId;

    @Column(name = "nit_proveedor", unique = true)
    private String nitProveedor;

    @Column(name = "nombre_proveedor")
    private String nombreProveedor;

    /* Relations Proveedor 1:1 Direccion */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "direccion_id", referencedColumnName = "direccion_id")
    private Direccion direccion;

    /* Relations Proveedor 1:N Productos */

}
