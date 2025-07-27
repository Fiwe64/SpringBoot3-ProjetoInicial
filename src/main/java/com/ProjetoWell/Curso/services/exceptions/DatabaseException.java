package com.ProjetoWell.Curso.services.exceptions;

import java.io.Serial;

public class DatabaseException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1159237623464674677L;

    public DatabaseException(String msg){
        super(msg);
    }
}
