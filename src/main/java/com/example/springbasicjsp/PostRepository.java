package com.example.springbasicjsp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostRepository {
    private static Map<Long, Post> database = new HashMap<>();

    private static long incrementId = 0L;
    private static final PostRepository instance = new PostRepository();

    public static PostRepository getInstance() {
        return instance;
    }

    private PostRepository() {}

    // Post 저장
    public Post save(Post post) {
        post.setId(++incrementId);
        database.put(post.getId(), post);
        return post;
    }

    // Post 전체 조회
    public List<Post> findAll() {
        return new ArrayList<>(database.values());
    }

}
