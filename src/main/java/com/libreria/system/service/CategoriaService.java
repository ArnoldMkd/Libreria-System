package com.libreria.system.service;

import com.libreria.system.entity.Categoria;
import com.libreria.system.repository.CategoriaRepository;
import org.hibernate.annotations.SecondaryRow;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository){
        this.categoriaRepository = categoriaRepository;
    }

    public List<Categoria> listarCategorias(){
        return categoriaRepository.findAll();
    }

    public Categoria guardarCategorias(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

}
