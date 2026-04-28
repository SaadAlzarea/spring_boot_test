package com.todo_app.todo_backend.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo_app.todo_backend.model.GroupMemberModel;
import com.todo_app.todo_backend.model.GroupModel;

public interface GroupRepository extends JpaRepository<GroupModel, UUID> {
} 


