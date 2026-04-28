package com.todo_app.todo_backend.service;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo_app.todo_backend.dto.GroupRequest;
import com.todo_app.todo_backend.enums.GroupMemberRole;
import com.todo_app.todo_backend.model.GroupMemberModel;
import com.todo_app.todo_backend.model.GroupModel;
import com.todo_app.todo_backend.repository.GroupMemberRepository;
import com.todo_app.todo_backend.repository.GroupRepository;
import com.todo_app.todo_backend.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class GroupService {

    
	private final GroupRepository groupRepository;
	private final GroupMemberRepository groupMemberRepository;

    public GroupService(GroupRepository groupRepository,GroupMemberRepository groupMemberRepository ) {
        this.groupRepository = groupRepository;
		this.groupMemberRepository = groupMemberRepository;
    }
  @Transactional
    public GroupModel createGroup(GroupRequest request){
		// ADD TRANSACTION TO LET AS ONE FUNCTION
        GroupModel group = new GroupModel();
        group.setGroup_id(UUID.randomUUID());
        group.setGroup_name(request.getGroup_name());
        group.setCreated_by(request.getCreated_by());
        group.setCreated_at(LocalDateTime.now());
		if(!group.length == 0 ){
			throw new Error("ll");
		}
		 groupRepository.save(group);

        GroupMemberModel groupMember = new GroupMemberModel();
        groupMember.setGroup_member_id(UUID.randomUUID());
        groupMember.setUser_id(request.getCreated_by());
        groupMember.setGroup_id(group.getGroup_id());
        groupMember.setGroup_member_role(GroupMemberRole.admin);

        groupMemberRepository.save(groupMember);

        return group;
    }
}
