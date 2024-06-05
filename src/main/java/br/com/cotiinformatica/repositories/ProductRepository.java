package br.com.cotiinformatica.repositories;

import br.com.cotiinformatica.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
