package com.todo_app.todo_backend.dto;

import java.sql.Date;

import com.todo_app.todo_backend.enums.UserRole;

import lombok.Data;

// @Data
public record UserRequest(
	String email,
	String username,
	String password,
	UserRole role
) {}



