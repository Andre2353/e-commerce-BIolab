package com.biolab.ecommerce.DTOs;

import com.biolab.ecommerce.entities.Role;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioRequest {
    @NotBlank
    private String nome;
    @Size (max = 20, message = "Não colocr mais de 40 caractres" ) @NotBlank
    @Email
    private String email;
    private String telefone;
    @Column(nullable = false)
    @Size(min = 6,max = 20)
    private String senha;
    private Role role;
}
