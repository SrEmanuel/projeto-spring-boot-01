package dev.emanuelm.projetospring01.repositories;

import dev.emanuelm.projetospring01.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
}
