package org.shawniels.blogmasteryproject.repositories;

import org.shawniels.blogmasteryproject.entities.Tag;
import org.springframework.data.repository.CrudRepository;

public interface TagRepository extends CrudRepository<Tag, Long> {
    Tag findByTagName(String tagName);
}
