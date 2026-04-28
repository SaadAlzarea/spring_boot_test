package com.todo_app.todo_backend.dto;

import java.util.UUID;

import lombok.Data;

@Data
public class GroupRequest {
    private String group_name;
    private UUID created_by;
}
