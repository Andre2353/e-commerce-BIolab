package com.biolab.ecommerce.repository;

import com.biolab.ecommerce.entities.Pedido;
import com.biolab.ecommerce.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Long> {
}
