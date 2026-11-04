package com.biolab.ecommerce.DTOs;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthDTO {
    @NotBlank
    private String cpf;
    @NotBlank
    private String senha;
}
