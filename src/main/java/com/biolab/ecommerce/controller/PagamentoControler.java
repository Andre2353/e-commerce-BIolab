package com.biolab.ecommerce.controller;

import com.biolab.ecommerce.DTOs.PagamentoDto;
import com.biolab.ecommerce.service.PagamentoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Pagamento")
public class PagamentoControler {
    private final PagamentoService service;

    public PagamentoControler(PagamentoService service) {
        this.service = service;
    }
    @PostMapping
    public ResponseEntity<?> savepayment(@RequestBody PagamentoDto dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.criarPagamento(dto));
    }
}
