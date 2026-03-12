package com.libreria.system.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;


@Entity
@Data
@Table(name="productos")
public class Producto extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    private String marca;

    private String modelo;

    private String color;

    @Column(length = 200)
    private String descripcion;

    @Column(nullable = false)
    private BigDecimal precio;

    @Column(nullable = false)
    private Integer stock = 0;

    @Column(unique = true, length = 50)
    private String codigoBarras;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name="proveedor_id")
    private Proveedor proveedor;

}
