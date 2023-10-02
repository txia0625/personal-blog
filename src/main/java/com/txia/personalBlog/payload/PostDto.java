package com.txia.personalBlog.payload;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
public class PostDto {
    private long id;

    @NotEmpty
    @Size(min = 2, message = "Post title should have 2 chars minimum.")
    private String title;

    @NotEmpty
    @Size(min = 10, message = "Post Description should have 2 chars minimum.")
    private String description;

    @NotEmpty
    private String content;
    private Set<CommentDto> comments;
}
