package com.churninsight.h12_25_l_equipo_49_backend.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1")
public class ChurnController {

    @PostMapping("/predict")
    public String predict(@RequestBody String body){
        return "Conexión Exitosa";
    }
}

