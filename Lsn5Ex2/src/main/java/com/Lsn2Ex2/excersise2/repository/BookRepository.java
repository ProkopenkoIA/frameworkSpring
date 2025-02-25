package com.Lsn2Ex2.excersise2.repository;

import com.Lsn2Ex2.excersise2.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
