package com.harman.userManagement.exception;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.harman.userManagement.dto.ErrorResponse;


@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler 
{
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
        List<String> details = new ArrayList<>();
        details.add(ex.getLocalizedMessage());
        ErrorResponse error = new ErrorResponse("Server Error", details);
        return new ResponseEntity(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @ExceptionHandler(SQLException.class)
    public final ResponseEntity<Object> handleSQLExceptions(SQLException ex, WebRequest request) {
    	List<String> details = new ArrayList<>();
        details.add(ex.getLocalizedMessage());
        ErrorResponse error = new ErrorResponse("Database Error", details);
        return new ResponseEntity(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @ExceptionHandler(UserException.class)
    public final ResponseEntity<Object> handleUserExceptions(UserException ex, WebRequest request) {
        ErrorResponse error = new ErrorResponse(ex.getMessage(), Arrays.asList(ex.getDetails()));
        return new ResponseEntity(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
 
}