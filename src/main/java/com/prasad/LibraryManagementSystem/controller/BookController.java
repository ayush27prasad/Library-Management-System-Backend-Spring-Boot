package com.prasad.LibraryManagementSystem.controller;
import com.prasad.LibraryManagementSystem.entity.Book;
import com.prasad.LibraryManagementSystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    public Book saveBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    public Book updateBook(){
        //FAKE
        return  bookService.updateBook(123L,new Book());
    }



}
