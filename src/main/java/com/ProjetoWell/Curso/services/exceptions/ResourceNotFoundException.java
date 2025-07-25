package com.ProjetoWell.Curso.services.exceptions;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = -3816682333055949130L;

    public ResourceNotFoundException(Object id){
        super("Resource not found. Id"+id);
    }
}
