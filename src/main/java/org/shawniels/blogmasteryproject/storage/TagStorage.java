package org.shawniels.blogmasteryproject.storage;

import org.shawniels.blogmasteryproject.entities.Tag;
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

    // Other methods
    public Iterable<Tag> findAllTags() {
        return tagRepo.findAll();
    }

    public Tag findTagByTagName(String tagName) {
        return tagRepo.findByTagName(tagName);
    }

    public void addTag(Tag tagToAdd) {
        tagRepo.save(tagToAdd);
    }
}
