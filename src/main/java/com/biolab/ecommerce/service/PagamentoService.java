package com.biolab.ecommerce.service;

import com.biolab.ecommerce.DTOs.PagamentoDto;
import com.biolab.ecommerce.entities.Pagamento;
import com.biolab.ecommerce.entities.Pedido;
import com.biolab.ecommerce.repository.PagamentoRepository;
import com.biolab.ecommerce.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class PagamentoService {
    private final PagamentoRepository pagamentoRepository;
    private final PedidoRepository pedidoRepository;

    public PagamentoService(PagamentoRepository pagamentoRepository, PedidoRepository pedidoRepository) {
        this.pagamentoRepository = pagamentoRepository;
        this.pedidoRepository = pedidoRepository;
    }
    public String criarPagamento (PagamentoDto dto){
        Pedido p = pedidoRepository.findById(dto.getIdPedido()).orElseThrow();
        Pagamento pagamento =new Pagamento();
        pagamento.setMomento(Instant.now());
        pagamento.setPedido(p);
        pagamentoRepository.save(pagamento);
        return "Pagameto Realizado com sucesso";
    }
}
