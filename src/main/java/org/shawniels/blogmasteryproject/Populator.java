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
        Author drShawniels = new Author("DrShawniels");
        Author sgdaniels08 = new Author("SGDaniels08");
        authorRepo.save(drShawniels);
        authorRepo.save(sgdaniels08);

        // Categories
        Category crochet = new Category("Crochet");
        Category crossStitch = new Category("Cross-stitch");
        categoryRepo.save(crochet);
        categoryRepo.save(crossStitch);

        // Tags
        Tag amigurumi = new Tag("amigurumi");
        Tag mythos = new Tag("mythos");
        Tag metallic = new Tag("metallic");
        Tag pixelart = new Tag("pixelart");
        Tag cartoon = new Tag("cartoon");
        Tag gift = new Tag("gift");
        tagRepo.save(amigurumi);
        tagRepo.save(mythos);
        tagRepo.save(metallic);
        tagRepo.save(pixelart);
        tagRepo.save(cartoon);
        tagRepo.save(gift);

        // Posts
        Post post1 = new Post("Crochet Cthulhu", drShawniels, date1, crochet, "A cute Cthulhu!", amigurumi, mythos);
        Post post2 = new Post("Pawprint Heart", drShawniels, date1, crossStitch, "Pretty!", metallic, gift);
        Post post3 = new Post("Chip and Dale", drShawniels, date1, crossStitch, "Childhood memories <3", pixelart, cartoon, gift);
        Post post4 = new Post("Crochet Zoidberg", sgdaniels08, date1, crochet, "Why not?", amigurumi, cartoon, gift);
        Post post5 = new Post("Cardinal", drShawniels, date1, crochet, "Mother's day present for my grandmother", amigurumi, gift);
        Post post6 = new Post("Gravity Falls Gnome", sgdaniels08, date1, crossStitch, "An unfinished but awesome project", cartoon);
        postRepo.save(post1);
        postRepo.save(post2);
        postRepo.save(post3);
        postRepo.save(post4);
        postRepo.save(post5);
        postRepo.save(post6);
    }
}
