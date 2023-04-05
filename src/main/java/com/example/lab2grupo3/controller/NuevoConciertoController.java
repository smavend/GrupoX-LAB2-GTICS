package com.example.lab2grupo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/nuevoConcierto")
public class NuevoConciertoController {
    @GetMapping(value = {"", "/"})
    @ResponseBody
    public String index(){
        return "PÁGINA EN CONSTRUCCIÓN";
    }
}
