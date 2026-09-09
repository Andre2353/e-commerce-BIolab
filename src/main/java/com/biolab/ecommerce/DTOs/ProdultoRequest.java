package com.biolab.ecommerce.DTOs;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Blob;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdultoRequest {
    private String nome;
    private String descricao;
    private  double preco;
    private Blob imgurl;
}
