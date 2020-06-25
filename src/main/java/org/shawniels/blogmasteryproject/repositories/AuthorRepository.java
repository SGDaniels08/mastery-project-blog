package org.shawniels.blogmasteryproject.repositories;

import org.shawniels.blogmasteryproject.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
