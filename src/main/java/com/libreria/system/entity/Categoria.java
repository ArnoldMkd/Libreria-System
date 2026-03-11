package com.libreria.system.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.Length;
import org.hibernate.engine.jdbc.Size;

@Entity
@Data
@Table(name="categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(length = 200)
    private String descripcion;

}
