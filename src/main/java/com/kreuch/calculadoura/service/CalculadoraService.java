package com.kreuch.calculadoura.service;


import com.kreuch.calculadoura.dto.CalculadoraRequest;
import com.kreuch.calculadoura.dto.CalculadoraResponse;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    double numero1,numero2,resultado;

    public CalculadoraResponse somar(CalculadoraRequest request){
        numero1 = request.getNumero1();
        numero2 = request.getNumero2();
        resultado = numero1 + numero2;
        return new CalculadoraResponse(numero1,numero2, "soma", resultado);
    }

    public CalculadoraResponse subtrair(CalculadoraRequest request){
        numero1 = request.getNumero1();
        numero2 = request.getNumero2();
        resultado = numero1 - numero2;
        return new CalculadoraResponse(numero1,numero2,"subtracao",resultado);
    }

    public CalculadoraResponse multiplicar(CalculadoraRequest request){
        numero1 = request.getNumero1();
        numero2 = request.getNumero2();
        resultado = numero1 * numero2;
        return new CalculadoraResponse(numero1,numero2,"multiplicacao",resultado);
    }

    public CalculadoraResponse dividir(CalculadoraRequest request){
        numero1 = request.getNumero1();
        numero2 = request.getNumero2();
        resultado = (numero2==0)? 0 : numero1/numero2;
        return new CalculadoraResponse(numero1,numero2,"divisão",resultado);
    }

}
