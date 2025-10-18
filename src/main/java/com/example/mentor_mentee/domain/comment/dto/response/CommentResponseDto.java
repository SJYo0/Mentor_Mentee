package com.example.mentor_mentee.domain.comment.dto.response;

import com.example.mentor_mentee.domain.comment.repository.CommentRepository;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CommentResponseDto {
    private final Long id;
    private final String body;
}
