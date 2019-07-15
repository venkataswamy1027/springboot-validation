package com.restapi.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ErrorResponse {
	private String errorMessage;
	private String requestDescription;
}
