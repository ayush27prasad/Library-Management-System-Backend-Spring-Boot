package com.prasad.LibraryManagementSystem.service;

import com.prasad.LibraryManagementSystem.entity.Book;

import java.util.List;

public interface BookService{
    public Book addBook(Book book);
    public Book updateBook(Long bookId, Book upadtedBook);
    public void deleteBook(Long bookId);
    public List<Book> fetchBooks();
    public Book fetchBookById(Long bookId);
    public List<Book> fetchBooksByName(String bookName);
    public List<Book> fetchBooksByAuthor(String bookAuthor);
    public List<Book> fetchBooksByGenre(String bookGenre);
}
