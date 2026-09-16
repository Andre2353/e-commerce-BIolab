package com.biolab.ecommerce.DTOs;

import com.biolab.ecommerce.entities.Pagamento;
import com.biolab.ecommerce.entities.StatusPedido;

import java.sql.Blob;
import java.time.Instant;

public class ProdutoResponse {
    private Long id;
    private String nome;
    private String descricao;
    private  double preco;
    private Blob imgurl;

    public ProdutoResponse(Long id, String nome, String descricao, double preco, String imgurl) {
    }


}
