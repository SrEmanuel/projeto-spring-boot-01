package dev.emanuelm.projetospring01.repositories;

import dev.emanuelm.projetospring01.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;

/*type of entity and the type of the primary key*/
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
