package com.biolab.ecommerce.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "itensPedido")
public class ItemPedido {

    private int qtd;
    private double preco;
    @EmbeddedId
    private ItensdoPedidoPk id = new ItensdoPedidoPk();

    public ItemPedido(int qtd, double preco, Pedido pedido,Produto produto) {
        this.qtd = qtd;
        this.preco = preco;
        id.setPedido(pedido);
        id.setProduto(produto);
    }

    public Pedido getPedido() {
        return id.getPedido();
    }

    public void setPedido(Pedido pedido) {
        id.setPedido(pedido);
    }
    public Produto getProduto() {
        return id.getProduto();
    }

    public void setProduto(Produto produto) {
        id.setProduto(produto);
    }
}

