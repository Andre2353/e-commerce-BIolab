package com.biolab.ecommerce.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "itensPedido")
public class ItemPedido {

    private int qtd;
    private double preco;

}
