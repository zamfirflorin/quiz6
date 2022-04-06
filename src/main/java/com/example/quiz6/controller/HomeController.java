package com.example.quiz6.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/add/first/{first}/second/{second}")
    public ResponseEntity<String> getFirstNameAndLastName(@PathVariable String first, @PathVariable String second) {
        return  ResponseEntity.ok(first.concat(" ").concat(second));
    }

}
