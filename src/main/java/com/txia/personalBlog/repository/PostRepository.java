package com.txia.personalBlog.repository;

import com.txia.personalBlog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepository extends JpaRepository<Post, Long> {

}
