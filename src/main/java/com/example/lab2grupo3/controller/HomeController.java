package com.example.lab2grupo3.controller;

import com.example.lab2grupo3.entity.Concierto;
import com.example.lab2grupo3.repository.ConciertoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    final ConciertoRepository conciertoRepository;

    public HomeController(ConciertoRepository conciertoRepository){
        this.conciertoRepository = conciertoRepository;
    }
    @GetMapping(value = {"", "/", "index"})
    public String index(Model model){
        List<Concierto> conciertoList = conciertoRepository.findAll();
        model.addAttribute("conciertoList", conciertoList);
        return "index";
    }
}
