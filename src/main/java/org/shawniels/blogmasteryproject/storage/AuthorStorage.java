package org.shawniels.blogmasteryproject.storage;

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

    // Getter
    public AuthorRepository getAuthorRepo() {
        return authorRepo;
    }
}
