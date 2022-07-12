package com.et.app.springboot.apirest.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "clientes")
@Data
public class Cliente implements Serializable {

    /**
    * 
    */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id")
    private Long clienteId;

    // @NotBlank(message = "El campo 'nombres' no debe estar vacio")
    private String nombres;

    // @NotBlank(message = "El campo 'paterno' no debe estar vacio")
    private String paterno;

    // @NotBlank(message = "El campo 'materno' no debe estar vacio")
    private String materno;

    // @Email
    @Column(name = "email", unique = true)
    private String email;

    // @Email
    @Column(name = "nit_cliente", unique = true)
    private String nitCliente;

    /* Relations Clientes N:N Productos */
    @OneToMany(mappedBy = "cliente")
    private Set<ClienteProducto> clienteProductos;

}
