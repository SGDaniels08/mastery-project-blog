package org.shawniels.blogmasteryproject.repositories;

import org.shawniels.blogmasteryproject.entities.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
