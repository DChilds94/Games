package com.nailed94.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    @GetMapping("/games")
    public String games() {
        return "This will return the games that I will create later";
    }
}
