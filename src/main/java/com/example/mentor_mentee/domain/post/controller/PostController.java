package com.example.mentor_mentee.domain.post.controller;

import com.example.mentor_mentee.domain.post.dto.request.PostRequestDto;
import com.example.mentor_mentee.domain.post.dto.response.PostResponseDto;
import com.example.mentor_mentee.domain.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor // 생성자 자동생성 | 생성자가 하나만 있다면 @autowired 자동진행
@RestController
@RequestMapping("/api/posts")
public class PostController {
    private final PostService postService;

    @PostMapping("/")
    public  PostResponseDto createPost(PostRequestDto postRequestDto){
        PostResponseDto responseDto = postService.createPost(postRequestDto);
        return responseDto;
    }

    @GetMapping
    public  String getAllPosts(){
        return "게시글 리스트 조회 완료";
    }

    @GetMapping("/{post-id}") // url에서는 get 요청밖에 못함
    public String getPostById(@PathVariable(value = "post-id") Long id){
        return id + "번 게시글 조회 완료";
    }

    @PutMapping("/{post-id}")
    public String updatePost(@PathVariable(value = "post-id") Long id) {
        return id + "번 게시글 수정 완료";
    }

    @DeleteMapping("/{post-id}")
    public String deletePost(@PathVariable(value = "post-id") Long id){
        return id + "번 게시글 삭제 완료";
    }
}
