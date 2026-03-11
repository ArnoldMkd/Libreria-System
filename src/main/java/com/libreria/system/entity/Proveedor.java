package com.libreria.system.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.Length;

@Entity
@Data
@Table(name = "Proveedores")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(length = 9)
    private String telefono;

    @Column(length = 100)
    private String correo;

    @Column(length = 100)
    private String direccion;

    @Column(length = 11, unique = true)
    private String ruc;

}
