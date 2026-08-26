package com.biolab.ecommerce.service;

import com.biolab.ecommerce.DTOs.PedidoRequest;
import com.biolab.ecommerce.entities.Pedido;
import com.biolab.ecommerce.entities.Usuario;
import com.biolab.ecommerce.repository.PedidoRepository;
import com.biolab.ecommerce.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    private final UsuarioRepository usuarioRepository;
    private final PedidoRepository pedidoRepository ;

    public PedidoService(UsuarioRepository usuarioRepository, PedidoRepository pedidoRepository) {
        this.usuarioRepository = usuarioRepository;
        this.pedidoRepository = pedidoRepository;
    }


    public String criarpedido(PedidoRequest dto){
        Usuario u =usuarioRepository.findById(dto.getIdcliente()).orElseThrow();
        Pedido p = new Pedido();
        p.setCliente(u);
        p.setMomento(dto.getMomento());
        p.setStatus(dto.getStatus());
        return "Pedido criado com sucesso";
    }
}
