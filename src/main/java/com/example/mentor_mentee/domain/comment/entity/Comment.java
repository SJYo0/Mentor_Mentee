package com.example.mentor_mentee.domain.comment.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    @Builder.Default
    private long likes = 0L;

    @Column(nullable = false)
    @Builder.Default
    private long dislikes = 0L;

}
