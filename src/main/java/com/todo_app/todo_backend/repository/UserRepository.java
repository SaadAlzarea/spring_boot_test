package com.todo_app.todo_backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo_app.todo_backend.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, String> {
	Optional<UserModel> findByEmail(String email);
	
}

