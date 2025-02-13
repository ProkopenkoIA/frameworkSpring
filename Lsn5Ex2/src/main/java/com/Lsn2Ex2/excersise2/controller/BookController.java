package com.Lsn2Ex2.excersise2.controller;

import com.Lsn2Ex2.excersise2.model.Book;
import com.Lsn2Ex2.excersise2.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
@AllArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping()
    public List<Book> getAllBook(){
        return bookService.getAllBooks();
    }



}
