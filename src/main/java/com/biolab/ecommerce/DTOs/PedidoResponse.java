package com.biolab.ecommerce.DTOs;

import com.biolab.ecommerce.entities.Pagamento;
import com.biolab.ecommerce.entities.StatusPedido;

import java.time.Instant;

public class  PedidoResponse {
    private Long id;
    private Instant momento;
    private StatusPedido status;
    private Long idcliente;

    public PedidoResponse(Long id, Instant momento, StatusPedido status, StatusPedido status1, Pagamento pagamento) {
    }
}
