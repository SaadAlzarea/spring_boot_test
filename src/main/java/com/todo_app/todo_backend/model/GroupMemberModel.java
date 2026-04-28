package com.todo_app.todo_backend.model;

import java.util.UUID;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import com.todo_app.todo_backend.enums.GroupMemberRole;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Setter
@Getter
@Table(name = "group_members")
public class GroupMemberModel {
	@Id
	@Column(name = "group_member_id")
	private UUID group_member_id;

	@Column(name = "group_id")
	private UUID group_id;

	@Column(name = "user_id")
	private UUID user_id;

	@Enumerated(EnumType.STRING)
	@JdbcTypeCode(SqlTypes.NAMED_ENUM)
	@Column(name = "group_member_role", columnDefinition = "group_member_role")
	private GroupMemberRole group_member_role;
}
