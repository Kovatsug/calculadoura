package com.kreuch.calculadoura.service;


import com.kreuch.calculadoura.dto.CalculadoraRequest;
import com.kreuch.calculadoura.dto.CalculadoraResponse;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {


    public CalculadoraResponse somar(CalculadoraRequest request){
        double numero1 = request.getNumero1();
        double numero2 = request.getNumero2();
        double resultado = numero1 + numero2;
        return new CalculadoraResponse(numero1,numero2, "soma", resultado);
    }

    public CalculadoraResponse subtrair(CalculadoraRequest request){
        double numero1 = request.getNumero1();
        double numero2 = request.getNumero2();
        double resultado = numero1 - numero2;
        return new CalculadoraResponse(numero1,numero2,"subtração",resultado);
    }

    public CalculadoraResponse multiplicar(CalculadoraRequest request){
        double numero1 = request.getNumero1();
        double numero2 = request.getNumero2();
        double resultado = numero1 * numero2;
        return new CalculadoraResponse(numero1,numero2,"multiplicação",resultado);
    }

    public CalculadoraResponse dividir(CalculadoraRequest request){
        double numero1 = request.getNumero1();
        double numero2 = request.getNumero2();
        double resultado = (numero2==0)? 0 : numero1/numero2;
        return new CalculadoraResponse(numero1,numero2,"divisão",resultado);
    }

}
