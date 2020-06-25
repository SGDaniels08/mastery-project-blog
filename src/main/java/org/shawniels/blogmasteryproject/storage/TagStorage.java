package org.shawniels.blogmasteryproject.storage;

import org.shawniels.blogmasteryproject.repositories.TagRepository;
import org.springframework.stereotype.Service;

@Service
public class TagStorage {

    // Instance Variables
    private TagRepository tagRepo;

    // Constructors
    public TagStorage(TagRepository tagRepo) {
        this.tagRepo = tagRepo;
    }

    // Getters
    public TagRepository getTagRepo() {
        return tagRepo;
    }
}
