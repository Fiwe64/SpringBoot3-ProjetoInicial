package com.ProjetoWell.Curso.repositories;

import com.ProjetoWell.Curso.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category,Long> {

}
