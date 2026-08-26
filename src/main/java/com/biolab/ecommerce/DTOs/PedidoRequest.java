package com.biolab.ecommerce.DTOs;

import com.biolab.ecommerce.entities.StatusPedido;
import com.biolab.ecommerce.entities.Usuario;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoRequest {
    private Instant momento;
    @NotBlank
    private StatusPedido status;
    @NotBlank
    private Long idcliente;
    public PedidoRequest( Long idcliente) {
        this.momento = Instant.now();
        this.status = StatusPedido.AGUARDANDO_PAGAMENTO;
        this.idcliente = idcliente;
    }
}
