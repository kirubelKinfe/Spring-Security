package com.example.security.error_handling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ApplicationExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> invalidArgumentException(MethodArgumentNotValidException exception) {
        Map<String, String> errors = new HashMap<>();
        exception.getBindingResult().getFieldErrors().forEach(e -> {
            errors.put(e.getField(), e.getDefaultMessage());

        });
        return errors;
    }
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(UserNotFoundException.class)
    public Map<String, String> userNotFoundException(UserNotFoundException exception) {
        Map<String, String> error = new HashMap<>();
        error.put("error", exception.getMessage());

        return error;
    }
}
