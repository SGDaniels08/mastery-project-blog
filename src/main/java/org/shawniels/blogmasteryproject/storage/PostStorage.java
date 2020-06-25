package org.shawniels.blogmasteryproject.storage;

import org.shawniels.blogmasteryproject.repositories.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostStorage {

    // Instance Variables
    private PostRepository postRepo;

    // Constructors
    public PostStorage(PostRepository postRepo) {
        this.postRepo = postRepo;
    }

    // Getters
    public PostRepository getPostRepo() {
        return postRepo;
    }
}
