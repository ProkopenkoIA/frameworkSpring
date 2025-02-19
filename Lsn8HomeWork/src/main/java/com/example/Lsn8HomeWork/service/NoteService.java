package com.example.Lsn8HomeWork.service;

import com.example.Lsn8HomeWork.model.Note;

import java.util.List;

public interface NoteService {
    Note createNote(Note note);

    List<Note> getAllNotes();

    Note getNoteById(Long id);

    Note updateNote(Note note);

    void deleteNote(Long id);
}