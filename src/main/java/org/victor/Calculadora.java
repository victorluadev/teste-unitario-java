package org.victor;

public class Calculadora {
    float soma(float num1, float num2){
        return num1 + num2;
    }

    float subtracao(float num1, float num2){
        return num1 - num2;
    }

    float multiplicacao(float num1, float num2){
        return num1 * num2;
    }

    float divisao(float num1, float num2){
        if(num1 == 0 || num2 == 0) {
            throw new RuntimeException("Não é possível dividir por 0");
        }
        return num1 / num2;
    }
}
