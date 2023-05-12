package com.dalmia.demo.exception;

import com.dalmia.demo.payloads.ApiErrorResponse;
import com.dalmia.demo.response.HeaderResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = ResourceNotFoundException.class)
    public ResponseEntity<ApiErrorResponse> NotFoundException(ResourceNotFoundException e) {

        HeaderResponse header = new HeaderResponse(404, "Not Found");

        ApiErrorResponse apiErrorResponse = new ApiErrorResponse();
        apiErrorResponse.setHeader(header);

        return new ResponseEntity<>(apiErrorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> methodArgsNotValidException(MethodArgumentNotValidException ex) {

        Map<String, String> map = new HashMap<>();

        ex.getBindingResult().getAllErrors().forEach(objectError -> {

            String field = ((FieldError) objectError).getField();
            String defaultMessage = objectError.getDefaultMessage();

            map.put(field, defaultMessage);
        });

        return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
    }

}
