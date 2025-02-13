package com.booking.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidFlightException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InvalidFlightException(String message) {
        super(message);
    }
}