package org.shawniels.blogmasteryproject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Author {

    // Instance Variables
    @Id
    private String userName;
    @OneToMany (mappedBy = "author")
    private Collection<Post> posts;

    // Constructors
    protected Author() {}
    public Author(String userName) {
        this.userName = userName;
    }

    // Getters
    public String getUserName() {
        return userName;
    }
    public Collection<Post> getPosts() {
        return posts;
    }

    // Other methods
    @Override
    public String toString() {
        return userName;
    }
}
