package com.kreuch.calculadoura.controller;

import com.kreuch.calculadoura.dto.CalculadoraRequest;
import com.kreuch.calculadoura.dto.CalculadoraResponse;
import com.kreuch.calculadoura.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    private final CalculadoraService service;

    @Autowired
    public CalculadoraController(CalculadoraService service) {
        this.service = service;
    }

    @PostMapping("/somar")
    public CalculadoraResponse somar(@RequestBody CalculadoraRequest request){
        return service.somar(request);
    }

    @PostMapping("/subtrair")
    public CalculadoraResponse subtrair(@RequestBody CalculadoraRequest request){
        return service.subtrair(request);
    }

    @PostMapping("/multiplicar")
    public CalculadoraResponse multiplicar(@RequestBody CalculadoraRequest request){
        return service.multiplicar(request);
    }

    @PostMapping("/dividir")
    public CalculadoraResponse dividir(@RequestBody CalculadoraRequest request){
        return service.dividir(request);
    }

}
