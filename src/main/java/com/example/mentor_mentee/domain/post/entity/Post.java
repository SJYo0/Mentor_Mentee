package com.example.mentor_mentee.domain.post.entity;

import com.example.mentor_mentee.domain.comment.entity.Comment;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    @Builder.Default // builder에서 초기값을 지정해줄 수 있게해주는 어노테이션
    private long views = 0L; // 초기값 설정해주기

    @OneToMany(mappedBy = "post") // OneToMany는 지연로딩이 디폴트, cascade 설정도 해줘야됨. orphanRemoval 도 해야됨
    @Builder.Default
    private List<Comment> comments = new ArrayList<>();

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
