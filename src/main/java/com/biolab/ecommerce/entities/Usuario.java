package com.biolab.ecommerce.entities;

import com.biolab.ecommerce.entities.enums.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(length = 100, nullable = false)
    private String nome;

    @NotBlank
    @Email
    @Column(length = 150, nullable = false, unique = true) // unique=true impede emails duplicados
    private String email;

    private String telefone;

    @NotBlank
    @Column(nullable = false)
    private String senha; // Removido @Size(max = 20) para suportar a Hash BCrypt (60 caracteres)

    @Enumerated(EnumType.STRING)
    private Role role;

    public Usuario(String nome, String email, String telefone, String senha) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.role = Role.USER;
    }
}