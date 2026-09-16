package com.biolab.ecommerce.service;

import com.biolab.ecommerce.DTOs.CategoriaRequest;
import com.biolab.ecommerce.DTOs.CategoriaResponse;
import com.biolab.ecommerce.DTOs.ProdutoRequest;
import com.biolab.ecommerce.DTOs.ProdutoResponse;
import com.biolab.ecommerce.entities.Categoria;
import com.biolab.ecommerce.entities.Produto;
import com.biolab.ecommerce.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }


    public String criarCategoria(CategoriaRequest dto) {
        Categoria categoria = new Categoria();
        categoria.setNome((dto.getNome()));
        categoriaRepository.save(categoria);

        return "categoria salva com sucesso";
    }

    public CategoriaResponse buscarpoid(Long id) {
        Categoria categoria = categoriaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException
                        ("Produlto não encontrado com id" + id));
        return new CategoriaResponse(
                categoria.getId(),
                categoria.getNome()
        );
    }

    public String deletar(Long id) {
        if (!categoriaRepository.existsById(id)) {
            return "Produlto não existe";
        }
        categoriaRepository.deleteById(id);
        return "Produlto deletado com sucesso";
    }

    public CategoriaResponse atualizarid(Long id, ProdutoRequest request) {
        Categoria categoriaExistente = categoriaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario não encontrado  com id :" + id));
        categoriaExistente.setNome(request.getNome());
        Categoria atualizando = categoriaRepository.save(categoriaExistente);
        return new CategoriaResponse(
                atualizando.getId(),
                atualizando.getNome()
                );
    }
}


