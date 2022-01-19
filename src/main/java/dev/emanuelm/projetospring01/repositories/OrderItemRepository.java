package dev.emanuelm.projetospring01.repositories;

import dev.emanuelm.projetospring01.entities.OrderItem;
import dev.emanuelm.projetospring01.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/*type of entity and the type of the primary key*/
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
