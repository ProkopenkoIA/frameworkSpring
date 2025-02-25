package com.example.Lsn6Ex2;

import com.example.Lsn6Ex2.model.Reader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReaderRepo extends JpaRepository<Reader, Long> {
}
