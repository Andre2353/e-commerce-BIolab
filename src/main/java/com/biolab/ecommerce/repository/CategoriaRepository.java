package com.biolab.ecommerce.repository;

import com.biolab.ecommerce.entities.Categoria;
import com.biolab.ecommerce.entities.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
}
