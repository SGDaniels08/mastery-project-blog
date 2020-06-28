package org.shawniels.blogmasteryproject.repositories;

import org.shawniels.blogmasteryproject.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Category findByCategoryName(String categoryName);
}
