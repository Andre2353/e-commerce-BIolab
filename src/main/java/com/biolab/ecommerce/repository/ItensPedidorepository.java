package com.biolab.ecommerce.repository;

import com.biolab.ecommerce.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItensPedidorepository extends JpaRepository<Pedido,Long> {
}
