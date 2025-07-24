package com.ProjetoWell.Curso.repositories;

import com.ProjetoWell.Curso.entities.OrderItem;
import com.ProjetoWell.Curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
