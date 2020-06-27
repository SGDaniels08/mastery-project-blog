package org.shawniels.blogmasteryproject.storage;

import org.shawniels.blogmasteryproject.entities.Author;
import org.shawniels.blogmasteryproject.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorStorage {

    // Instance Variables
    private AuthorRepository authorRepo;

    // Constructors
    public AuthorStorage(AuthorRepository authorRepo) {
        this.authorRepo = authorRepo;
    }

    // Getters
    public AuthorRepository getAuthorRepo() {
        return authorRepo;
    }

    // Other methods
    public Iterable<Author> findAllAuthors() {
        return authorRepo.findAll();
    }

    public Author findAuthorByUserName(String authorUserName) {
        return authorRepo.findByUserName(authorUserName);
    }

    public void addAuthor(Author toAdd) {
        authorRepo.save(toAdd);
    }
}
