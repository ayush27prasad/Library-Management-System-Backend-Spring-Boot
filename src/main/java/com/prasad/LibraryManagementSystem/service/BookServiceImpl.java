package com.prasad.LibraryManagementSystem.service;

import com.prasad.LibraryManagementSystem.entity.Book;
import com.prasad.LibraryManagementSystem.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> fetchBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book updateBook(Long bookId, Book upadtedBook) {
        Book existingBook = bookRepository.findById(bookId).get();
        existingBook.setName(upadtedBook.getName());
        existingBook.setAuthor(upadtedBook.getAuthor());
        existingBook.setGenre(upadtedBook.getGenre());
        return bookRepository.save(existingBook);
    }

    @Override
    public void deleteBook(Long bookId) {
        bookRepository.deleteById(bookId);
    }

    @Override
    public Book fetchBookById(Long bookId) {
        return bookRepository.findById(bookId).get();
    }

    @Override
    public List<Book> fetchBooksByName(String bookName) {
        return bookRepository.findByName(bookName);
    }

    @Override
    public List<Book> fetchBooksByAuthor(String bookAuthor) {
        return bookRepository.findByAuthor(bookAuthor);
    }

    @Override
    public List<Book> fetchBooksByGenre(String bookGenre) {
        return bookRepository.findByGenre(bookGenre);
    }
}
