package com.ProjetoWell.Curso.repositories;

import com.ProjetoWell.Curso.entities.Category;
import com.ProjetoWell.Curso.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,Long> {

}
