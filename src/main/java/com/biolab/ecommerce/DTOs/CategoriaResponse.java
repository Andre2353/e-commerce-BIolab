package com.biolab.ecommerce.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class CategoriaResponse {
    private String nome;

    public CategoriaResponse(Long id, String nome) {
        this.nome = nome;
    }
}
