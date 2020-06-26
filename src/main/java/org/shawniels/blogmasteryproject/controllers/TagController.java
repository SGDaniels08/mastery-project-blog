package org.shawniels.blogmasteryproject.controllers;

import org.shawniels.blogmasteryproject.entities.Tag;
import org.shawniels.blogmasteryproject.repositories.TagRepository;
import org.shawniels.blogmasteryproject.storage.TagStorage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TagController {

    // Instance Variables
    private TagStorage tagStorage;

    // Constructors
    public TagController(TagStorage tagStorage) {
        this.tagStorage = tagStorage;
    }

    // Getters
    public TagStorage getTagStorage() {
        return tagStorage;
    }

    // HTTP Request Methods
    @GetMapping ("/tags")
    public String showAllTags(Model model) {
        model.addAttribute("tags", tagStorage.findAllTags());
        return "tags-template";
    }
}
