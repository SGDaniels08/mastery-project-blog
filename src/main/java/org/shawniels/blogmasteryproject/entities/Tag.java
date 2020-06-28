package org.shawniels.blogmasteryproject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class Tag {

    // Instance Variables
    @Id
    @GeneratedValue
    private int id;
    private String tagName;
    @ManyToMany (mappedBy = "tags")
    private Collection<Post> posts;

    // Constructors
    protected Tag() {}

    public Tag(String tagName) {
        this.tagName = tagName;
    }

    // Getters

    public String getTagName() {
        return tagName;
    }
    public Collection<Post> getPosts() {
        return posts;
    }


}
