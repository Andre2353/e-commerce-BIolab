package com.biolab.ecommerce.controller;

import com.biolab.ecommerce.DTOs.ProdutoRequest;
import com.biolab.ecommerce.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
