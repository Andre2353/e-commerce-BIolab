package com.biolab.ecommerce.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Blob;
@Data
@NoArgsConstructor
public class ProdutoRequest {
    @NotBlank
    private String nome;
    private String descricao;
    @NotNull
    private  double preco;
    private Blob imgurl;
    private Long idCategoria;

    public ProdutoRequest(String nome, String descricao, double preco, Blob imgurl, Long idCategoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.imgurl = imgurl;
        this.idCategoria = idCategoria;
    }
}
