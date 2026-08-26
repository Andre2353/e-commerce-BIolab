package com.biolab.ecommerce.service;

import com.biolab.ecommerce.DTOs.UsuarioRequest;
import com.biolab.ecommerce.entities.Usuario;
import com.biolab.ecommerce.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private final UsuarioRepository repo;

    public UsuarioService(UsuarioRepository repo) {
        this.repo = repo;
    }
    public String criar(UsuarioRequest u){
        Usuario usuario = new Usuario(u.getNome(),u.getEmail(), u.getTelefone(), u.getSenha());{
            repo.save(usuario);
        return "Usuario service";
    }
}
}
