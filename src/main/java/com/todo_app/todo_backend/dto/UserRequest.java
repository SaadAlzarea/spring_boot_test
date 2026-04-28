package com.todo_app.todo_backend.dto;

import java.sql.Date;

import com.todo_app.todo_backend.enums.UserRole;

import lombok.Data;

@Data
public class UserRequest {
	private String email;
	private String username;
	private String password;
	private UserRole role;
}



