package com.biolab.ecommerce.DTOs;

import com.biolab.ecommerce.entities.ItensdoPedidoPk;
import com.biolab.ecommerce.entities.Pedido;
import com.biolab.ecommerce.entities.Produto;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class itensPedidoRequest {
    private Pedido pedido;
    private int qtd;
    private double preco;
}
