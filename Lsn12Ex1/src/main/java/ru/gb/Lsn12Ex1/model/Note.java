package ru.gb.Lsn12Ex1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Note {

    private Long id;


    private String title;


    private String content;


    private LocalDateTime createdDate;

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }


}