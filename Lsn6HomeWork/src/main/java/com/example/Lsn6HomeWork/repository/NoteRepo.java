package com.example.Lsn6HomeWork.repository;

import com.example.Lsn6HomeWork.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NoteRepo extends JpaRepository<Note, Long> {

    Optional<Note> findById(Long id);
}