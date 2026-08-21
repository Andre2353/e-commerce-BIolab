package com.biolab.ecommerce.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
// substitui os getters e setters
@Data
//substitui o construtor com todos os argumentos
@AllArgsConstructor
//substitui o construtor vazio
@NoArgsConstructor
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column(length = 100)
    private String nome;
    @Column(length =150) @NotBlank @Email
    private String email;
    private String telefone;
    @Column(nullable = false)
    @Size(min = 6)
    private String senha;
    @Column(nullable = false)
    private String[] roles;

}
