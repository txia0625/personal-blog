package com.txia.personalBlog.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CommentDto {
    private long id;

    @NotEmpty
    @Size(min = 2, message = "Name should have 2 chars minimum.")
    private String name;

    @NotEmpty(message = "Email should not be null or empty")
    @Email
    private String email;

    @NotEmpty(message = "Comment should not be null or empty")
    @Size(min = 10, message = "Comment should have at least 10 chars")
    private String body;
}
