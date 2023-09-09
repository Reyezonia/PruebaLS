package com.example.prueba.controller;

import com.example.prueba.Models.SopaResponse;
import com.example.prueba.service.MatrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.example.prueba.Models.SopaRequest;

@RestController
@RequestMapping("/prueba")
public class MatrixController {

    @Autowired
    MatrixService matrixServ;


    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public SopaResponse buscarPalabra(@RequestBody SopaRequest sopa){
       SopaResponse sopaLetras = matrixServ.buscarPlabra(sopa);

    return sopaLetras;
    }

}
