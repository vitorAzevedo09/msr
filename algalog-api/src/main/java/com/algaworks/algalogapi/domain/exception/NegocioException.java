package com.algaworks.algalogapi.domain.exception;


/**
 * NegocioException
 */
public class NegocioException extends RuntimeException {
    private static final long SerialVersionUID = 1L;

    public NegocioException(String message){
        super(message);
    }
}
