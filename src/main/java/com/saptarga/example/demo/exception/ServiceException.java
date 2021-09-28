package com.saptarga.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class ServiceException extends Exception {

    private static final long serialVersionUID = 8024895122045859786L;

    public ServiceException(String message) {
        super(message);
    }
}
