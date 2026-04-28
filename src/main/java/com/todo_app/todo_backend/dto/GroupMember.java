package com.todo_app.todo_backend.dto;

import java.util.UUID;

import com.todo_app.todo_backend.enums.GroupMemberRole;

import lombok.Data;


public record GroupMember(
	UUID group_id,
	UUID user_id,
	GroupMemberRole group_member_role
) {}
