package com.example.trupper.exceptions;

public class SaveException extends RuntimeException{

    public SaveException(){
        super("Error al guardar pedido.");
    }
}
