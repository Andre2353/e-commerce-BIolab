package com.biolab.ecommerce.controller;

import com.biolab.ecommerce.DTOs.ProdutoRequest;
import com.biolab.ecommerce.DTOs.ProdutoResponse;
import com.biolab.ecommerce.DTOs.UsuarioRequest;
import com.biolab.ecommerce.DTOs.UsuarioResponse;
import com.biolab.ecommerce.repository.UsuarioRepository;
import com.biolab.ecommerce.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("Usuario")
@RestController
public class UsuarioController {
   private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }
    @PostMapping
    public ResponseEntity<?> criarusuario(@Valid @RequestBody UsuarioRequest dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.criarUsuario(dto));
    }@GetMapping
    public ResponseEntity<List<UsuarioResponse>> listar() {
        return ResponseEntity.ok(service.mostrarUsuarios());
    }
    @GetMapping("/{id}")
    public ResponseEntity<UsuarioResponse> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarpoid(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id) {
        String mensagem = service.deletar(id);
        return ResponseEntity.ok(mensagem);
    }

}
