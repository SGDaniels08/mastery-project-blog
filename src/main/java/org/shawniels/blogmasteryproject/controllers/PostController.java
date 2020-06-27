package org.shawniels.blogmasteryproject.controllers;

import org.shawniels.blogmasteryproject.storage.PostStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

    // Instance Variables
    private PostStorage postStorage;

    // Constructor
    public PostController(PostStorage postStorage) {
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
        return "homepage-template";
    }
}
