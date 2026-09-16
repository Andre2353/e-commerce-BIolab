
package com.biolab.ecommerce.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoResponse {
    private Long id;
    private String nome;
    private String descricao;
    private Double preco;
    private String imgurl;
}
