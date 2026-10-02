package com.biolab.ecommerce.DTOs;

import com.biolab.ecommerce.entities.ItensdoPedidoPk;
import com.biolab.ecommerce.entities.Pedido;
import com.biolab.ecommerce.entities.Produto;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ItensPedidoRequest {
    private int qtd;
    private double preco;
    private long pedidoid;
    private Long produltoid;
}
