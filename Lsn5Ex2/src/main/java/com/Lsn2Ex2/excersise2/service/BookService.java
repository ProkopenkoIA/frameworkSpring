package com.Lsn2Ex2.excersise2.service;


import com.Lsn2Ex2.excersise2.model.Book;
import com.Lsn2Ex2.excersise2.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    /**
     * Получить список книг
     * @return список книг
     */
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id){
        return bookRepository.findById(id);
    }

    public Book createBook(Book book){
        return bookRepository.save(book);
    }

    public Book updateBook(Long id, Book bookDetails){
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()){
            Book book = optionalBook.get();
            book.setTitle(bookDetails.getTitle());
            book.setAuthor(bookDetails.getAuthor());
            book.setPublicationYear(bookDetails.getPublicationYear());
            return bookRepository.save(book);

        } else {
            throw new IllegalArgumentException("Не найдена книга по указанному id");
        }

    }

    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }

}
