package ru.gb.Lsn12Ex1.controller;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.gb.Lsn12Ex1.model.Note;
import ru.gb.Lsn12Ex1.services.Gateway;

import java.time.LocalDateTime;


@RestController
@RequiredArgsConstructor
@RequestMapping("/note")
public class NoteController {

    //@Autowired
    private final Gateway fileGateway;

    @PostMapping
    public ResponseEntity<Note> createNote(@RequestBody Note note) {
        note.setCreatedDate(LocalDateTime.now());
        fileGateway.writeToFile(note.getTitle()+".txt", note.toString());
        return new ResponseEntity<>(HttpStatus.OK);
    }

}