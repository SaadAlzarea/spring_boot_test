package com.todo_app.todo_backend.service;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.todo_app.todo_backend.dto.LoginRequest;
import com.todo_app.todo_backend.dto.UserRequest;
import com.todo_app.todo_backend.model.UserModel;
import com.todo_app.todo_backend.repository.UserRepository;

@Service
public class UserService {

	// public UserRepository _userRepository;
private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

	public UserModel register(UserRequest request){
		UserModel userModel = new UserModel();

		userModel.setUserId(UUID.randomUUID());
		userModel.setUsername(request.getUsername());
		userModel.setEmail(request.getEmail());
		userModel.setPassword(request.getPassword());
		userModel.setRole(request.getRole());

		userModel.setCreated_at(LocalDateTime.now());
		userModel.setUpdatedAt(LocalDateTime.now()); 

		return userRepository.save(userModel);
	}

	public String login(LoginRequest request){
		UserModel user = this.userRepository
		.findByEmail(request.getEmail())
		.orElseThrow(()-> new RuntimeException("Username or Password is not valid"));

		if(!user.getPassword().equals((request.getPassword()))){
			throw new RuntimeException("Username or Password is not valid");
		}

		String response  = "Login Success," + " welcome " + user.getUsername();

		return response;
	}
	
}
