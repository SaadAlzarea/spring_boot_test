package com.todo_app.todo_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo_app.todo_backend.dto.LoginRequest;
import com.todo_app.todo_backend.dto.UserRequest;
import com.todo_app.todo_backend.model.UserModel;
import com.todo_app.todo_backend.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/users")
public class UserController {

@Autowired
private UserService _userService;

	@PostMapping("register")
	public UserModel postMethodName(@RequestBody UserRequest request) {
		return this._userService.register(request);
	}

	@PostMapping("login")
	public String login(@RequestBody LoginRequest request) {
		return this._userService.login(request);
	}
	
}