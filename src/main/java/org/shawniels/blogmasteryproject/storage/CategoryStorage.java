package org.shawniels.blogmasteryproject.storage;

import org.shawniels.blogmasteryproject.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryStorage {

    // Instance Variables
    private CategoryRepository categoryRepo;

    // Constructors
    public CategoryStorage(CategoryRepository categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    // Getter
    public CategoryRepository getCategoryRepo() {
        return categoryRepo;
    }
}
