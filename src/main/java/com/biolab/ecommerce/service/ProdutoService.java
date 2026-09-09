package com.biolab.ecommerce.service;

import com.biolab.ecommerce.DTOs.ProdutoRequest;
import com.biolab.ecommerce.entities.Categoria;
import com.biolab.ecommerce.entities.Produto;
import com.biolab.ecommerce.repository.CategoriaRepository;
import com.biolab.ecommerce.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    private final CategoriaRepository categoriaRepository;
    private final ProdutoRepository produtoRepository;

    public ProdutoService(CategoriaRepository categoriaRepository, ProdutoRepository produtoRepository) {
        this.categoriaRepository = categoriaRepository;
        this.produtoRepository = produtoRepository;
    }


    public String criar (ProdutoRequest dto){
         Produto p = new Produto();
         p.setNome(dto.getNome());
         p.setDescricao(dto.getDescricao());
         p.setPreco(dto.getPreco());
         p.setImgurl(dto.getImgurl());

        Categoria cat = categoriaRepository.getReferenceById(dto.getIdCategoria());
        p.getCategorias().add(cat);
        produtoRepository.save(p);
         return "Produto salvo com sucesso";
     }
}
