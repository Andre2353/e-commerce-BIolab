package com.biolab.ecommerce.DTOs;

import com.biolab.ecommerce.entities.Role;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


public class UsuarioResponse {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String senha;
    private Role role;

    public UsuarioResponse(Long id, @NotBlank String nome, @NotBlank @Email String email, String telefone, @Size(min = 6, max = 20) String senha, Role role) {


    }
}
