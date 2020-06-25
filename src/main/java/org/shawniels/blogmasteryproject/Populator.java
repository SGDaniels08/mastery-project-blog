package org.shawniels.blogmasteryproject;

import org.shawniels.blogmasteryproject.entities.Author;
import org.shawniels.blogmasteryproject.entities.Category;
import org.shawniels.blogmasteryproject.entities.Post;
import org.shawniels.blogmasteryproject.entities.Tag;
import org.shawniels.blogmasteryproject.repositories.AuthorRepository;
import org.shawniels.blogmasteryproject.repositories.CategoryRepository;
import org.shawniels.blogmasteryproject.repositories.PostRepository;
import org.shawniels.blogmasteryproject.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Populator implements CommandLineRunner {

    @Autowired
    private AuthorRepository authorRepo;
    @Autowired
    private CategoryRepository categoryRepo;
    @Autowired
    private TagRepository tagRepo;
    @Autowired
    private PostRepository postRepo;

    @Override
    public void run(String... args) throws Exception {

        // LocalDate
        LocalDate date1 = LocalDate.of(2020,6,15);

        // Authors
        Author author1 = new Author("DrShawniels");
        authorRepo.save(author1);

        // Categories
        Category cat1 = new Category("Crochet");
        Category cat2 = new Category("Cross-stitch");
        categoryRepo.save(cat1);
        categoryRepo.save(cat2);

        // Tags
        Tag tag1 = new Tag("amigurumi");
        Tag tag2 = new Tag("mythos");
        Tag tag3 = new Tag("metallic");
        Tag tag4 = new Tag("pixelart");
        tagRepo.save(tag1);
        tagRepo.save(tag2);
        tagRepo.save(tag3);
        tagRepo.save(tag4);

        // Posts
        Post post1 = new Post("Crochet Cthulhu", author1, date1, cat1, "A cute Cthulhu!", tag1, tag2);
        Post post2 = new Post("Pawprint Heart", author1, date1, cat2, "Pretty!", tag3);
        Post post3 = new Post("Chip and Dale", author1, date1, cat2, "Childhood memories <3", tag4);
        postRepo.save(post1);
        postRepo.save(post2);
        postRepo.save(post3);
    }
}
