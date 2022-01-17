package com.learnkafka.controller;

import com.learnkafka.domain.LibraryEvent;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryEventController {
    @PostMapping("v1/libraryevent")
    public ResponseEntity<LibraryEvent> postLibraryEvent(LibraryEvent libraryEvent){
        //invoke kafka producer
        return ResponseEntity.status(HttpStatus.CREATED).body(libraryEvent);
    }
}
