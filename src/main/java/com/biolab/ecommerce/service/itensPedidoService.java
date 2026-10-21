package com.biolab.ecommerce.service;

import com.biolab.ecommerce.DTOs.ItensPedidoRequest;
import com.biolab.ecommerce.entities.ItemPedido;
import com.biolab.ecommerce.entities.Pedido;
import com.biolab.ecommerce.entities.Produto;
import com.biolab.ecommerce.repository.ItensPedidorepository;
import com.biolab.ecommerce.repository.PedidoRepository;
import com.biolab.ecommerce.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class itensPedidoService {

    private final ItensPedidorepository itensPedidorepository;
    private final PedidoRepository pedidoRepository;
    private final ProdutoRepository produtoRepository;

    public itensPedidoService(ItensPedidorepository itensPedidorepository,
                              PedidoRepository pedidoRepository,
                              ProdutoRepository produtoRepository) {
        this.itensPedidorepository = itensPedidorepository;
        this.pedidoRepository = pedidoRepository;
        this.produtoRepository = produtoRepository;
    }

    public ItemPedido criarItens(ItensPedidoRequest request) {
        Pedido pedido = pedidoRepository.findById(request.getPedidoid())
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado com ID: " + request.getPedidoid()));

        Produto produto = produtoRepository.findById(request.getProdultoid())
                .orElseThrow(() -> new RuntimeException("Produto não encontrado com ID: " + request.getProdultoid()));

        ItemPedido item = new ItemPedido(request.getQtd(), request.getPreco(), pedido, produto);

        return itensPedidorepository.save(item);
    }
}