package com.biolab.ecommerce.repository;

import com.biolab.ecommerce.entities.Pagamento;
import com.biolab.ecommerce.entities.Produlto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produlto,Long> {
}
