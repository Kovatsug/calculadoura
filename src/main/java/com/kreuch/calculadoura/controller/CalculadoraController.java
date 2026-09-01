package com.kreuch.calculadoura.controller;

import com.kreuch.calculadoura.dto.CalculadoraRequest;
import com.kreuch.calculadoura.dto.CalculadoraResponse;
import com.kreuch.calculadoura.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @Autowired
    CalculadoraService service;

    @PostMapping("/calculadora/somar")
    public CalculadoraResponse somar(@RequestBody CalculadoraRequest request){
        return service.somar(request);
    }

    @PostMapping("/calculadora/subtrair")
    public CalculadoraResponse subtrair(@RequestBody CalculadoraRequest request){
        return service.subtrair(request);
    }

    @PostMapping("/calculadora/multiplicar")
    public CalculadoraResponse multiplicar(@RequestBody CalculadoraRequest request){
        return service.multiplicar(request);
    }

    @PostMapping("/calculadora/dividir")
    public CalculadoraResponse dividir(@RequestBody CalculadoraRequest request){
        return service.dividir(request);
    }

}
