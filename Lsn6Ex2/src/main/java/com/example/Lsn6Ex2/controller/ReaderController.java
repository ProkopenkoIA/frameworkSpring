package com.example.Lsn6Ex2.controller;


import com.example.Lsn6Ex2.ReaderRepo;
import com.example.Lsn6Ex2.model.Reader;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reader")
@RequiredArgsConstructor
public class ReaderController {

    private final ReaderRepo readerRepo;

    @GetMapping
    public List<Reader> getAll(){
      return  readerRepo.findAll();
    }

    @PostMapping
    public Reader createReader(@RequestBody Reader reader){

        return readerRepo.save(reader);
    }


}
