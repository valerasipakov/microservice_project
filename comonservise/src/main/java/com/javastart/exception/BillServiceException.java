package com.javastart.exception;

public class BillServiceException extends RuntimeException {
    public BillServiceException (String message){
        super(message);
    }
}
