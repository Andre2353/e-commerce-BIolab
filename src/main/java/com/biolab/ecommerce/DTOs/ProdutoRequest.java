package com.biolab.ecommerce.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Blob;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoRequest {
    private String nome;
    private String descricao;
    private  double preco;
    private Blob imgurl;
}
