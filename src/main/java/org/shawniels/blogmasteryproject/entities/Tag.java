package org.shawniels.blogmasteryproject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class Tag {

    // Instance Variables
    @Id
    private String name;
    @ManyToMany
    private Collection<Post> posts;

    // Constructors
    protected Tag() {}

    public Tag(String name) {
        this.name = name;
    }

    // Getters

    public String getName() {
        return name;
    }
    public Collection<Post> getPosts() {
        return posts;
    }
}