package org.shawniels.blogmasteryproject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Category {

    // Instance Variables
    @Id
    @GeneratedValue
    private int id;
    private String categoryName;
    @OneToMany(mappedBy = "category")
    private Collection<Post> posts;

    // Constructors
    protected Category() {}
    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    // Getters
    public String getCategoryName() {
        return categoryName;
    }
    public Collection<Post> getPosts() {
        return posts;
    }

    // Other methods
    @Override
    public String toString() {
        return categoryName;
    }
}
