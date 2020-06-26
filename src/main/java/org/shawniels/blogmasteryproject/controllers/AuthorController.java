package org.shawniels.blogmasteryproject.controllers;

import org.shawniels.blogmasteryproject.storage.AuthorStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
