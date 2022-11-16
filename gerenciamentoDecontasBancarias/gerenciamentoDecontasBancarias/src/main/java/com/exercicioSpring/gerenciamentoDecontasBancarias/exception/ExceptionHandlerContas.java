package com.exercicioSpring.gerenciamentoDecontasBancarias.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpTimeoutException;

@RestControllerAdvice
public class ExceptionHandlerContas extends ResponseEntityExceptionHandler {

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<String> execptionHandlerDadosInvalidos(HttpMessageNotReadableException exception, HttpServletRequest request){
        return new ResponseEntity<> ("Os dados inseridos são invalidos !", HttpStatus.BAD_REQUEST);

    }


}
