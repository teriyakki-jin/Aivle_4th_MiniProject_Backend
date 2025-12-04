package com.example.aivle_4th_MiniProject_team19.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Member extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String username;
    private String password;

    @OneToMany(mappedBy = "member")
    private List<Book> books = new ArrayList<>();
}
