package com.ProjetoWell.Curso.repositories;

import com.ProjetoWell.Curso.entities.Order;
import com.ProjetoWell.Curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order,Long> {

}
