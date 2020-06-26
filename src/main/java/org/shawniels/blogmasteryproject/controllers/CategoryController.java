package org.shawniels.blogmasteryproject.controllers;

import org.shawniels.blogmasteryproject.storage.CategoryStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CategoryController {

    // Instance Variables
    private CategoryStorage categoryStorage;

    // Constructor
    public CategoryController(CategoryStorage categoryStorage) {
        this.categoryStorage = categoryStorage;
    }

    // Getters
    public CategoryStorage getCategoryStorage() {
        return categoryStorage;
    }

    // HTTP Request Methods
    @GetMapping ("/categories")
    public String showAllCategories(Model model) {
        model.addAttribute("categories", categoryStorage.findAllCategories());
        return "categories-template";
    }

    @GetMapping ("/categories/{categoryName}")
    public String showSingleCategory(@PathVariable String categoryName, Model model) {
        model.addAttribute("category", categoryStorage.findCategoryByName(categoryName));
        return "category-template";
    }
}
