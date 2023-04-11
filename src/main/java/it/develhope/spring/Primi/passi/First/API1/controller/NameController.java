package it.develhope.spring.Primi.passi.First.API1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api")
public class NameController {

    @GetMapping("/")
    public String getName(@RequestParam String name){
        return "Il mio nome: " + name;
    }

    @PostMapping("/")
    public String postReversedName(@RequestParam String name){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name);
        return "Il mio nome all'inverso: " + stringBuilder.reverse().toString();
    }

    // Documentazione Postman: https://documenter.getpostman.com/view/26121086/2s93Xu3RcN
}
