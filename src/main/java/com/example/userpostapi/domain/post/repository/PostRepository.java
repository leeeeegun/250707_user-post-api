package com.example.userpostapi.domain.post.repository;

import com.example.userpostapi.domain.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
