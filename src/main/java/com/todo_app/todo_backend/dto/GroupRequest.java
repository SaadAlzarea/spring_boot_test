package com.todo_app.todo_backend.dto;

import java.util.UUID;

import lombok.Data;

// @Data
public record GroupRequest(     
	String group_name,
	UUID created_by
){}
