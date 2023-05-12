package com.prasad.LibraryManagementSystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_id_seq")
    @SequenceGenerator(name = "book_id_seq", sequenceName = "BOOK_ID_SEQ", allocationSize = 1)
    @Column(name = "book_id")
    private Long bookId;

    @Column(name = "book_name")
    private String name;

    @Column(name = "book_author")
    private String author;

    @Column(name = "book_genre")
    private String genre;
}
