package aula07_orientacao_a_objetos2;

/*Crie uma classe Calculadora com atributos privados valor1(double) e valor2(double)
e métodos para realizar operações básicas como soma, subtração, multiplicação e divisão.
Adicione um construtor nesta classe que receba dois valores inteiros. Crie uma classe
 chamada PrincipalCalculadora que tenha um objeto do tipo Calculadora. Utilize os métodos somar,
 subtração, multiplicação e divisão com os valores informados no construtor e mostre na tela o
 resultado de cada um dos cálculos.*/

public class Calculadora {

    private double valor1;
    private double valor2;

    public Calculadora(int valor1, int valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public double soma(){
        return valor1 + valor2;
    }

    public double subtracao(){
        return valor1 - valor2;
    }

    public double multiplicacao(){
        return valor1 * valor2;
    }

    public double divisao(){
        return valor1 / valor2;
    }
}
