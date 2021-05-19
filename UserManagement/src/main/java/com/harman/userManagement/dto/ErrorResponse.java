package com.harman.userManagement.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResponse 
{
 
    public ErrorResponse(String message, List<String> details2) {
		this.message = message;
		this.details= details2;
	}

	private String message;
 
    private List<String> details;
}