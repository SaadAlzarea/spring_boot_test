package com.todo_app.todo_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo_app.todo_backend.dto.GroupRequest;
import com.todo_app.todo_backend.model.GroupModel;
import com.todo_app.todo_backend.service.GroupService;


@RestController
@RequestMapping("groups")
public class GroupController {

    private final GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @PostMapping("/create")
    public GroupModel createGroup(@RequestBody GroupRequest request){
        return groupService.createGroup(request);
    }
}

/**
 * * TO CREATE GROUP USE THIS PATH 
 *  todo : http://localhost:8080/group/api/create-group
 */