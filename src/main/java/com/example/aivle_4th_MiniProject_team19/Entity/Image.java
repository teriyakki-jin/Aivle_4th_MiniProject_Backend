package com.example.aivle_4th_MiniProject_team19.Entity;

import jakarta.persistence.*;

@Entity
public class Image extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "image_id")
    private String id;
    private String originName;
    private String modifiedName;

    @OneToOne
    @JoinColumn
    private Book book;
}
