package com.biolab.ecommerce.service;

import com.biolab.ecommerce.DTOs.ProdutoRequest;
import com.biolab.ecommerce.DTOs.ProdutoResponse;
import com.biolab.ecommerce.entities.Categoria;
import com.biolab.ecommerce.entities.Produto;
import com.biolab.ecommerce.repository.CategoriaRepository;
import com.biolab.ecommerce.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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

        Categoria cat = categoriaRepository.findById(dto.getIdCategoria())
                .orElseThrow(() -> new RuntimeException("Categoria não encontrada com o ID: " + dto.getIdCategoria()));
        p.getCategorias().add(cat);
        produtoRepository.save(p);
         return "Produto salvo com sucesso";
     }
     public List<ProdutoResponse>ListarProdultos(){
        return produtoRepository.findAll().stream()
                .map((produto -> new ProdutoResponse(
                        produto.getId(),
                        produto.getNome(),
                        produto.getDescricao(),
                        produto.getPreco(),
                        produto.getImgurl()
                ))).toList();
     }
     public ProdutoResponse buscarpoid(Long id) {
         Produto produto = produtoRepository.findById(id)
                 .orElseThrow(() -> new RuntimeException
                         ("Produlto não encontrado com id" + id));
         return new ProdutoResponse(
                 produto.getId(),
                 produto.getNome(),
                 produto.getDescricao(),
                 produto.getPreco(),
                 produto.getImgurl()
         );
     }
    public String deletar(Long id) {
        if (!produtoRepository.existsById(id)) {
            return "Produlto não existe";
        }
        produtoRepository.deleteById(id);
        return "Produlto deletado com sucesso";
    }
    public ProdutoResponse atualizarid(Long id, ProdutoRequest request){
        Produto produltoExistente = produtoRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Usuario não encontrado  com id :" +id));
                produltoExistente.setNome(request.getNome());
                produltoExistente.setDescricao(request.getDescricao());
                produltoExistente.setPreco(request.getPreco());
                produltoExistente.setImgurl(request.getImgurl());
                Produto atualizando = produtoRepository.save(produltoExistente);
                return new ProdutoResponse(
                        atualizando.getId(),
                        atualizando.getNome(),
                        atualizando.getDescricao(),
                        atualizando.getPreco(),
                        atualizando.getImgurl()
                );
    }


}
