package com.example.Lsn8HomeWork.repository;

import com.example.Lsn8HomeWork.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NoteRepo extends JpaRepository<Note, Long> {

    Optional<Note> findById(Long id);
}