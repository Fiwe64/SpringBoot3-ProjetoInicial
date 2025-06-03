package com.ProjetoWell.Curso.entities.resources;

import com.ProjetoWell.Curso.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"Well","Well@gmail","9324","1234");

        return ResponseEntity.ok().body(u);
    }

}
