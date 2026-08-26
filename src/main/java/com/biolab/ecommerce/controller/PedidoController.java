package com.biolab.ecommerce.controller;

import com.biolab.ecommerce.DTOs.PedidoRequest;
import com.biolab.ecommerce.service.PedidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Pedido")
public class PedidoController {
    private final PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }
    @PostMapping
    public ResponseEntity<?>saveorder (@RequestBody PedidoRequest dto){
        return ResponseEntity.ok((service.criarpedido(dto)));
    }
}
