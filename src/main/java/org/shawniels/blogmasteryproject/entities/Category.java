package org.shawniels.blogmasteryproject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Category {

    // Instance Variables
    @Id
    private String name;
    @OneToMany(mappedBy = "category")
    private Collection<Post> posts;

    // Constructors
    protected Category() {}
    public Category(String name) {
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