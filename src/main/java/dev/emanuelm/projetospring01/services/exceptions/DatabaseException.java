package dev.emanuelm.projetospring01.services.exceptions;

public class DatabaseException extends RuntimeException{


    public DatabaseException(String msg){
        super(msg);
    }

}
