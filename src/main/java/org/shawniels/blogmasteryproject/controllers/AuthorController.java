package org.shawniels.blogmasteryproject.controllers;

import org.shawniels.blogmasteryproject.entities.Author;
import org.shawniels.blogmasteryproject.storage.AuthorStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthorController {

    // Instance Variables
    private AuthorStorage authorStorage;

    // Constructors
    public AuthorController(AuthorStorage authorStorage) {
        this.authorStorage = authorStorage;
    }

    // Getters
    public AuthorStorage getAuthorStorage() {
        return authorStorage;
    }

    // HTTP Request Methods
    @GetMapping ("/authors")
    public String showAllAuthors(Model model) {
        model.addAttribute("authors", authorStorage.findAllAuthors());
        return "authors-template";
    }

    @GetMapping ("/authors/{authorUserName}")
    public String showSingleAuthor(@PathVariable String authorUserName, Model model) {
        model.addAttribute("author", authorStorage.findAuthorByUserName(authorUserName));
        return "author-template";
    }

    @PostMapping("/add/authors")
    public String addAuthor(String userName) {
        Author toAdd = new Author(userName);
        authorStorage.addAuthor(toAdd);
        return "redirect:/authors";
    }
}
