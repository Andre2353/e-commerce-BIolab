package com.biolab.ecommerce.controller;

import com.biolab.ecommerce.DTOs.UsuarioRequest;
import com.biolab.ecommerce.repository.UsuarioRepository;
import com.biolab.ecommerce.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("Usuario")
@RestController
public class UsuarioController {
   private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }


    @PostMapping
    public ResponseEntity<?> saveuser(@RequestBody UsuarioRequest dto){
        return ResponseEntity.ok(service.criar(dto));

    }
}
