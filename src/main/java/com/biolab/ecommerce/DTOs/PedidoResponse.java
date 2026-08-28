package com.biolab.ecommerce.DTOs;

import com.biolab.ecommerce.entities.StatusPedido;

import java.time.Instant;

public class  PedidoResponse {
    private Long id;
    private Instant momento;
    private StatusPedido status;
    private Long idcliente;
}
