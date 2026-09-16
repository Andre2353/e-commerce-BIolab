package com.biolab.ecommerce.controller;

import com.biolab.ecommerce.DTOs.CategoriaRequest;
import com.biolab.ecommerce.DTOs.CategoriaResponse;
import com.biolab.ecommerce.DTOs.ProdutoRequest;
import com.biolab.ecommerce.service.CategoriaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @PostMapping
    public ResponseEntity<String> criarCategoria(@RequestBody CategoriaRequest request) {
        String resposta = categoriaService.criarCategoria(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(resposta);
    }

    @GetMapping
    public ResponseEntity<List<CategoriaResponse>> listarCategorias() {
        List<CategoriaResponse> categorias = categoriaService.Listarcategoria();
        return ResponseEntity.ok(categorias);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaResponse> buscarPorId(@PathVariable Long id) {
        CategoriaResponse categoria = categoriaService.buscarpoid(id);
        return ResponseEntity.ok(categoria);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CategoriaResponse> atualizarCategoria(@PathVariable Long id, @RequestBody ProdutoRequest request) {
        CategoriaResponse categoriaAtualizada = categoriaService.atualizarid(id, request);
        return ResponseEntity.ok(categoriaAtualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarCategoria(@PathVariable Long id) {
        String resposta = categoriaService.deletar(id);
        return ResponseEntity.ok(resposta);
    }
}