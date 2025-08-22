package aula01_funcoes_e_procedimentos;

/*Escreva um procedimento que imprima a tabuada de um número inteiro dado como entrada.*/

import java.util.Scanner;

public class Aula01Atv5 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero: ");

        int numero = ler.nextInt();
        imprimirNumeros(numero);

    }

    public static void imprimirNumeros(int numero) {

        for (int i = 0; i <= 10; i++) {

            System.out.printf("%d * %d = %d\n", 5, i , i * numero);

        }
    }
}