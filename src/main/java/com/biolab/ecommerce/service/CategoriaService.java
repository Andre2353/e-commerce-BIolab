package com.biolab.ecommerce.service;

import com.biolab.ecommerce.DTOs.CategoriaRequest;
import com.biolab.ecommerce.entities.Categoria;
import com.biolab.ecommerce.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }


    public String criarCategoria(CategoriaRequest dto){
        Categoria categoria = new Categoria();
        categoria.setNome((dto.getNome()));
        categoriaRepository.save(categoria);

        return "categoria salva com sucesso";

    }
}
