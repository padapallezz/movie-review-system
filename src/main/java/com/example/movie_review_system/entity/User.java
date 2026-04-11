package com.example.movie_review_system.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.management.relation.Role;

@Entity
@Table(name ="users")
@Getter
@Setter @NoArgsConstructor @AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(unique = true, nullable=false)
    private String userName;

    @Column (unique = true, nullable=false)
    private String passwordHash;

    @Column (unique = true, nullable=false)
    private String email;

    @Enumerated(EnumType.STRING)
    private Role role = Role.USER;
}

public enum Role{
    USER, ADMIN
}
