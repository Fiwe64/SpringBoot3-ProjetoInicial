package com.ProjetoWell.Curso.repositories;

import com.ProjetoWell.Curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
