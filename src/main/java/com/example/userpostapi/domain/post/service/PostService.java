package com.example.userpostapi.domain.post.service;

import com.example.userpostapi.domain.post.entity.Post;
import com.example.userpostapi.domain.post.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post updatePost(Long id, Post post) {
        Post existing = postRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("게시글 없음"));
        existing.setTitle(post.getTitle());
        existing.setContent(post.getContent());
        return postRepository.save(existing);
    }

    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }
}
