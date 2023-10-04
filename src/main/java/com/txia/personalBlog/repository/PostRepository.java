package com.txia.personalBlog.repository;

import com.txia.personalBlog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByCategoryId(long categoryId);
}
