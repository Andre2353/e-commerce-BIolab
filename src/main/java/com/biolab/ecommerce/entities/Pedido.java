package com.biolab.ecommerce.entities;

import com.biolab.ecommerce.entities.enums.StatusPedido;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant momento;
    private StatusPedido status;
    @ManyToOne
    private Usuario cliente;
    @OneToOne(mappedBy = "pedido", cascade = CascadeType.ALL)
    private Pagamento pagamento;
    @OneToMany(mappedBy = "id.pedido")
    private Set<ItemPedido>itens = new HashSet<>();
    public List<Produto>getProduto(){
        return itens.stream().map(x -> x.getProduto()).toList();
    }
}
