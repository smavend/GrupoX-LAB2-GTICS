package com.example.lab2grupo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProveedoresController {
    @GetMapping("/proveedor")
    public String lista(){
        return "proveedor";
    }
}
