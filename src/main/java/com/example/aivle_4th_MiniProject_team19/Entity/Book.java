package com.example.aivle_4th_MiniProject_team19.Entity;

import jakarta.persistence.*;

@Entity
public class Book extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "book_id")
    private Long id;

    private String title;
    private String author_name;
    private String category;
    private String description;

    @ManyToOne
    @JoinColumn
    private Member member;

    @OneToOne
    private Image image;
}
