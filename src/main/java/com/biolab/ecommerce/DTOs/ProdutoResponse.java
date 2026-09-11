package com.biolab.ecommerce.DTOs;

import java.sql.Blob;

public class ProdutoResponse {
    private Long id;
    private String nome;
    private String descricao;
    private  double preco;
    private Blob imgurl;

    public ProdutoResponse(Long id, String nome, String descricao, double preco, String imgurl) {
    }
}
