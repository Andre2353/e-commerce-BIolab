package com.biolab.ecommerce.service;

import com.biolab.ecommerce.DTOs.UsuarioRequest;
import com.biolab.ecommerce.DTOs.UsuarioResponse;
import com.biolab.ecommerce.entities.Usuario;
import com.biolab.ecommerce.repository.UsuarioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    public UsuarioRequest criarUsuario(UsuarioRequest request) {
        Usuario usuario = new Usuario();
        usuario.setNome(request.getNome());
        usuario.setEmail(request.getEmail());
        usuario.setSenha(request.getSenha());
        usuario.setRole(request.getRole());
        usuarioRepository.save(usuario);
        return request;
    }
    public List<UsuarioResponse> mostrarUsuarios() {
        return usuarioRepository.findAll().stream()
                .map(usuario -> new UsuarioResponse(
                        usuario.getId(),
                        usuario.getNome(),
                        usuario.getEmail(),
                        usuario.getTelefone(),
                        usuario.getSenha(),
                        usuario.getRole()))
                .toList();
    }
    public String deletar(long id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        if (usuario.isEmpty()) { // Corrigido de (usuario == null) para (usuario.isEmpty())
            return "Usuário não existe";
        } else {
            usuarioRepository.deleteById(id);
            return "Usuário kickado";
        }
    }public String atualizarid(Long id, Usuario usuarioatualizado) {
        Usuario usuarioexistente = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("usuario não encontrado: " + id));

        usuarioexistente.setNome(usuarioatualizado.getNome());
        usuarioexistente.setEmail(usuarioatualizado.getEmail());
        usuarioexistente.setSenha(usuarioatualizado.getSenha());

        usuarioRepository.save(usuarioexistente);
        return "usuario atualizado com sucesso";
    }

}
