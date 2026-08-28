package com.biolab.ecommerce.repository;

import com.biolab.ecommerce.entities.Pagamento;
import com.biolab.ecommerce.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento,Long> {
}
