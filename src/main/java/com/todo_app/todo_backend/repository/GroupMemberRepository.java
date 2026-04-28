package com.todo_app.todo_backend.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo_app.todo_backend.model.GroupMemberModel;

public interface GroupMemberRepository extends JpaRepository<GroupMemberModel, UUID> {
}
