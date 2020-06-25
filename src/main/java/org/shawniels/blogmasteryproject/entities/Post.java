package org.shawniels.blogmasteryproject.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Post {

    // Instance Variables
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    @ManyToOne
    private Author author;
    private LocalDate publishDate;
    @ManyToOne
    private Category category;
    private String content;
    @ManyToMany
    private Collection<Tag> tags;


    // Constructors
    protected Post() {
    }

    public Post(String title, Author author, LocalDate publishDate, Category category, String content, Tag... tags) {
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
        this.category = category;
        this.content = content;
        this.tags = new ArrayList<Tag>(Arrays.asList(tags));
    }

    // Getters
    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }
    public LocalDate getPublishDate() {
        return publishDate;
    }
    public Category getCategory() {
        return category;
    }
    public String getContent() {
        return content;
    }
    public Collection<Tag> getTags() {
        return tags;
    }
}
