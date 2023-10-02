package com.txia.personalBlog.service;

import com.txia.personalBlog.payload.PostDto;
import com.txia.personalBlog.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);
    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);
    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);
    void deletePostById(long id);

}
