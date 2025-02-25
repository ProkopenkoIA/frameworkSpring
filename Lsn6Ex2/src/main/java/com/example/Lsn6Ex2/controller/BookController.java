package com.example.Lsn6Ex2.controller;


import com.example.Lsn6Ex2.BookRepo;
import com.example.Lsn6Ex2.ReaderRepo;
import com.example.Lsn6Ex2.model.Book;
import com.example.Lsn6Ex2.model.Reader;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {
    private final BookRepo bookRepo;
    private final ReaderRepo readerRepo;

    @PostMapping
    private Book Create(@RequestBody Book book){
        return bookRepo.save(book);
    }

    @GetMapping
    public List<Book> getAll(){
        return bookRepo.findAll();
    }

    @GetMapping("{id}")
    public Book getById(@PathVariable("id") Long id){
        return bookRepo.findById(id).orElseThrow(null);
    }

    @PutMapping("/books/{id}/reader/{readerId}")
    public ResponseEntity<Book> assignReaderToBook(@PathVariable Long id, @PathVariable Long readerId) {
        Optional<Book> bookOptional = bookRepo.findById(id);
        Optional<Reader> readerOptional = readerRepo.findById(readerId);

        if(bookOptional.isPresent() && readerOptional.isPresent()){
            Book book = bookOptional.get();
            Reader reader = readerOptional.get();
            book.setReader(reader);
            return  ResponseEntity.ok(book);
        } else {

            return ResponseEntity.notFound().build();
        }

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        Optional<Book> bookOptional = bookRepo.findById(id);
        if(bookOptional.isPresent()){
           bookRepo.deleteById(id);
           return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
