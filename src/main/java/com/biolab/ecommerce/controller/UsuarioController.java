package com.biolab.ecommerce.controller;

import com.biolab.ecommerce.DTOs.UsuarioRequest;
import com.biolab.ecommerce.DTOs.UsuarioResponse;
import com.biolab.ecommerce.entities.Usuario;
import com.biolab.ecommerce.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<UsuarioRequest> criarUsuario(@RequestBody UsuarioRequest request) {
        UsuarioRequest novoUsuario = usuarioService.criarUsuario(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoUsuario);
    }

    @GetMapping
    public ResponseEntity<List<UsuarioResponse>> mostrarUsuarios() {
        List<UsuarioResponse> usuarios = usuarioService.mostrarUsuarios();
        return ResponseEntity.ok(usuarios);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioResponse> buscarPorId(@PathVariable Long id) {
        UsuarioResponse usuario = usuarioService.buscarpoid(id);
        return ResponseEntity.ok(usuario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
        String resposta = usuarioService.atualizarid(id, usuario);
        return ResponseEntity.ok(resposta);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarUsuario(@PathVariable Long id) {
        String resposta = usuarioService.deletar(id);
        return ResponseEntity.ok(resposta);
    }
}