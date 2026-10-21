package com.biolab.ecommerce.DTOs;

import com.biolab.ecommerce.entities.enums.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class UsuarioResponse {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private Role role;

    public UsuarioResponse(Long id, String nome, String email, String telefone, Role role) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.role = role;
    }

    // getters e setters (ou use Lombok @Data + @AllArgsConstructor)
}

