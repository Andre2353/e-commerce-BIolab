package com.biolab.ecommerce.controller;

import com.biolab.ecommerce.DTOs.CategoriaRequest;
import com.biolab.ecommerce.repository.CategoriaRepository;
import com.biolab.ecommerce.service.CategoriaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("categoria")
public class CategoriaController {
    private final CategoriaService Service;

    public CategoriaController(CategoriaService service) {
        Service = service;
    }


    @PostMapping
    public ResponseEntity<?> criarcat(@RequestBody CategoriaRequest dto){
        return  ResponseEntity.status(HttpStatus.CREATED).body((Service.criarCategoria(dto)));
    }
}

