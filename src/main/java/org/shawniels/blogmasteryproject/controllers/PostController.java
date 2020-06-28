package org.shawniels.blogmasteryproject.controllers;

import org.shawniels.blogmasteryproject.entities.Author;
import org.shawniels.blogmasteryproject.entities.Category;
import org.shawniels.blogmasteryproject.entities.Post;
import org.shawniels.blogmasteryproject.entities.Tag;
import org.shawniels.blogmasteryproject.storage.AuthorStorage;
import org.shawniels.blogmasteryproject.storage.CategoryStorage;
import org.shawniels.blogmasteryproject.storage.PostStorage;
import org.shawniels.blogmasteryproject.storage.TagStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.util.Collection;

@Controller
public class PostController {

    // Instance Variables
    private AuthorStorage authorStorage;
    private CategoryStorage categoryStorage;
    private TagStorage tagStorage;
    private PostStorage postStorage;

    // Constructor
    public PostController(AuthorStorage authorStorage, CategoryStorage categoryStorage, TagStorage tagStorage, PostStorage postStorage) {
        this.authorStorage = authorStorage;
        this.categoryStorage = categoryStorage;
        this.tagStorage = tagStorage;
        this.postStorage = postStorage;
    }

    // Getter
    public PostStorage getPostStorage() {
        return postStorage;
    }

    // HTTP Request Methods
    @GetMapping ({"", "/"})
    public String homePageShowAllPosts(Model model) {
        model.addAttribute("posts", postStorage.findAllPosts());
        model.addAttribute("authors", authorStorage.findAllAuthors());
        model.addAttribute("categories", categoryStorage.findAllCategories());
        model.addAttribute("tags", tagStorage.findAllTags());

        return "homepage-template";
    }

    @PostMapping ("/add-post")
    public String addPost(String title, String userName, String categoryName, String content) {

        Author authorToAdd = authorStorage.findAuthorByUserName(userName);
        Category categoryToAdd = categoryStorage.findCategoryByCategoryName(categoryName);
        Post postToAdd = new Post(title, authorToAdd, LocalDate.now(), categoryToAdd, content);
        postStorage.addPost(postToAdd);
        return "redirect:/";
    }
}
