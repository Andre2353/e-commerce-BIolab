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

    public itensPedidoService(ItensPedidorepository itensPedidorepository, PedidoRepository pedidoRepository, ProdutoRepository produtoRepository) {
        this.itensPedidorepository = itensPedidorepository;
        this.pedidoRepository = pedidoRepository;
        this.produtoRepository = produtoRepository;
    }
    public ItensPedidoRequest criarItens(ItensPedidoRequest request){
        public ItemPedido criarItens(ItensPedidoRequest request) {
            Pedido pedido = pedidoRepository.findById(request.getPedidoId())
                    .orElseThrow(() -> new RuntimeException("Pedido não encontrado com ID: " + request.getPedidoId()));

            Produto produto = produtoRepository.findById(request.getProdutoId())
                    .orElseThrow(() -> new RuntimeException("Produto não encontrado com ID: " + request.getProdutoId()));

    }
}

