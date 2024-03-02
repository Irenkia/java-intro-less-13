package com.example.javaintroless13;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController("/home")
public class SumController {
    @GetMapping("/home")
    public Optional<Integer> getSumFromList(@RequestParam("list") List<Integer> list) {
        return list.stream().reduce((a, b) -> a + b);
    }
}

