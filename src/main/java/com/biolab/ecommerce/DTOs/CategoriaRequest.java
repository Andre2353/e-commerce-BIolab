package com.biolab.ecommerce.DTOs;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CategoriaRequest {
    @NotBlank
    private String nome;

    public CategoriaRequest(String nome) {
        this.nome = nome;
    }
}
