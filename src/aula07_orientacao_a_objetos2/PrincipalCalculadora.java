package aula07_orientacao_a_objetos2;

/*Crie uma classe Calculadora com atributos privados valor1(double) e valor2(double)
e métodos para realizar operações básicas como soma, subtração, multiplicação e divisão.
Adicione um construtor nesta classe que receba dois valores inteiros. Crie uma classe
 chamada PrincipalCalculadora que tenha um objeto do tipo Calculadora. Utilize os métodos somar,
 subtração, multiplicação e divisão com os valores informados no construtor e mostre na tela o
 resultado de cada um dos cálculos.*/

public class PrincipalCalculadora {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora(7, 3);

        System.out.println("A soma dos valores e " + calculadora.soma());
        System.out.println("A subtração sos valores e " + calculadora.subtracao());
        System.out.println("A multiplicação dos valores e " + calculadora.multiplicacao());
        System.out.println("A divisão dos valores e " + calculadora.divisao());
    }
}
