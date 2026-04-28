package com.todo_app.todo_backend.dto;

import lombok.Data;

// @Data
public record LoginRequest(
	String email,
	String password
) {}
