package com.library.library_manager.repository.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;

@Entity
@Getter
@Setter
public class Book {
    @Id
    @UuidGenerator
    private String id;
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private String genre;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "book_author", // Join Table
            joinColumns = @JoinColumn(name = "book_id"),  // Column in join table referencing Book
            inverseJoinColumns = @JoinColumn(name = "author_id") // Column in join table referencing Author
    )
    private List<Author> authors;
}
