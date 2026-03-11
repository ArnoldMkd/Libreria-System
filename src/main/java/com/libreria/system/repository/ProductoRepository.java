package com.libreria.system.repository;

import com.libreria.system.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    List<Producto> findByNombreContainingIgnoreCase(String nombre);
    Optional<Producto> findByCodigoBarras(String codigoBarras);

    List<Producto> findByStockLessThan(int stock);
    List<Producto> findByStockGreaterThan(int stock);

    List<Producto> findByCategoriaId(Long categoriaId);


    List<Producto> findByNombreContainingIgnoreCaseOrCodigoBarras(String nombre, String codigoBarras);

}
