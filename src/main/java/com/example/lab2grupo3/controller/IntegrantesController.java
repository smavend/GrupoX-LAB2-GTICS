package com.example.lab2grupo3.controller;

import com.example.lab2grupo3.entity.Integrante;
import com.example.lab2grupo3.repository.IntegranteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/integrante")
public class IntegrantesController {
    final IntegranteRepository integranteRepository;
    public IntegrantesController(IntegranteRepository integranteRepository){
        this.integranteRepository = integranteRepository;
    }
    @GetMapping(value = {"", "/"})
    public String index(Model model){
        List<Integrante> integranteList = integranteRepository.findAll();
        model.addAttribute("integranteList", integranteList);
        return "integrante";
    }
}
