package aula02_funcoes_e_procedimentos2;

/*Crie um método chamado calcularFibonacci que aceita um número inteiro n como parâmetro
e retorna o n-ésimo termo da sequência de Fibonacci. A sequência de Fibonacci começa
com 0 e 1, e cada termo subsequente é a soma dos dois termos anteriores (0, 1, 1, 2, 3, 5, 8, ...).
Chame esse método e informe para que o usuário informe o n-ésimo termo da sequência de Fibonacci e
exiba o resultado.
*/

import java.util.Scanner;

public class Aula02Atv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        int numero = scanner.nextInt();

        System.out.println(calcularFibonacci(numero));
        scanner.close();
    }

    public static int calcularFibonacci(int numero) {
        if (numero == 0) return 0;
        if (numero == 1) return 1;

        int numeroAnterior = 0;
        int numeroAtual = 1;
        int numeroDeFibonacci = 0;

        for (int i = 2; i <= numero; i++) {
            numeroDeFibonacci = numeroAnterior + numeroAtual;
            numeroAnterior = numeroAtual;
            numeroAtual = numeroDeFibonacci;
        }

        return numeroDeFibonacci;
    }
}

