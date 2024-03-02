package com.example.javaintroless13;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {
    @GetMapping("/home")
    public String getTextInCapitalLetters(@RequestParam("text")String text){
        return text.toUpperCase();
    }
}
