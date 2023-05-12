package com.prasad.LibraryManagementSystem.repository;

import com.prasad.LibraryManagementSystem.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository <Book,Long> {

    public List<Book> findByName(String bookName);
    public List<Book> findByAuthor(String bookAuthor);
    public List<Book> findByGenre(String bookGenre);

}
