package org.shawniels.blogmasteryproject.controllers;

import org.shawniels.blogmasteryproject.storage.PostStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
    @GetMapping ("home")
    public String homePageShowAllPosts(Model model) {
        model.addAttribute("posts", postStorage.findAllPosts());
        return "homepage-template";
    }
}
