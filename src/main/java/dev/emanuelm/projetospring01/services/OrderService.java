package dev.emanuelm.projetospring01.services;

import dev.emanuelm.projetospring01.entities.Order;
import dev.emanuelm.projetospring01.repositories.OrderRepository;
import dev.emanuelm.projetospring01.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }

}
