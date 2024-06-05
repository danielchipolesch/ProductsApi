package br.com.cotiinformatica.repositories;

import br.com.cotiinformatica.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
