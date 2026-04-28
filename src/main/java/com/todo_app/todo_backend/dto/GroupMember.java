package com.todo_app.todo_backend.dto;

import java.util.UUID;

import com.todo_app.todo_backend.enums.GroupMemberRole;

import lombok.Data;

@Data
public class GroupMember {
	private UUID group_id;
	private UUID user_id;
	private GroupMemberRole group_member_role;
}
