package com.biolab.ecommerce.DTOs;

import com.biolab.ecommerce.entities.Role;
import jakarta.persistence.Id;


public class UsuarioResponse {
    @Id
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String senha;
    private Role role;
}
