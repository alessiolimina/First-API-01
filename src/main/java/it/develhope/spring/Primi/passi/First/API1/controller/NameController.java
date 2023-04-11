package it.develhope.spring.Primi.passi.First.API1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api")
public class NameController {

    @GetMapping("/name")
    public String getName(@RequestParam String name){
        return "il mio nome: " + name;
    }

    @PostMapping("/name")
    public String postReversedName(@RequestParam String name){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name);
        return "il mio nome all'inverso: " + stringBuilder.reverse().toString();
    }
}
