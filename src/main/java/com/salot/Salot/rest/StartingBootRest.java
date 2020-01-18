package com.salot.Salot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "")
public class StartingBootRest {

    @GetMapping
    public String startingBoot() {
        return "Boot Iniciado!";
    }

}
