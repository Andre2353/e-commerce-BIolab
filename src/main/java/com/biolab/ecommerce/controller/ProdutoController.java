package com.biolab.ecommerce.controller;

import com.biolab.ecommerce.DTOs.ProdutoRequest;
import com.biolab.ecommerce.DTOs.ProdutoResponse;
import com.biolab.ecommerce.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("produto")
@RestController
public class ProdutoController {
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public ResponseEntity<?> criarprodulto(@Valid@RequestBody ProdutoRequest dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.criar(dto));
    }
    @GetMapping
    public ResponseEntity<List<ProdutoResponse>> listar() {
        return ResponseEntity.ok(produtoService.ListarProdultos());
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProdutoResponse> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(produtoService.buscarpoid(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id) {
        String mensagem = produtoService.deletar(id);
        return ResponseEntity.ok(mensagem);
    }
    @PutMapping("/{id}")
    public ResponseEntity<ProdutoResponse> atualizar(@PathVariable Long id, @RequestBody ProdutoRequest request) {
        return ResponseEntity.ok(produtoService.atualizarid(id, request));
    }
}
