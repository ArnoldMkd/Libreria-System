package com.libreria.system.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;


@Entity
@Data
@Table(name="productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomb;

    @Column(length = 200)
    private String descrip;

    @Column(nullable = false)
    private BigDecimal precio;

    @Column(nullable = false)
    private Integer stock;

    private String codBarras;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

}
