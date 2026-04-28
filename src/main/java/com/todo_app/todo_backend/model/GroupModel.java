package com.todo_app.todo_backend.model;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "groups")
@Data
public class GroupModel {

    @Id
    @Column(name = "group_id")
    private UUID group_id;

    @Column(name = "group_name")
    private String group_name;

    @Column(name = "created_by")
    private UUID created_by;

    @Column(name = "created_at")
    private LocalDateTime created_at;
}