package aula01_funcoes_e_procedimentos;

/*Crie um programa que tenha um procedimento que imprima todos os números ímpares entre
dois números inteiros dados como entrada e outro procedimento com valores pares.*/

import java.util.Scanner;

public class Aula01Atv6 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero: ");

        int numero = ler.nextInt();

        System.out.println("Digite o segundo numero: ");

        int numero2 = ler.nextInt();

        System.out.println("Os numeros pares sao: ");
        imprimirPares(numero, numero2);

        System.out.println("Os numeros Impares sao: ");
        imprimirImpares(numero, numero2);


    }

    public static void imprimirPares(int numero, int numero2) {

        for (int i = numero; i <= numero2; i++) {

            if (i % 2 == 0){
                System.out.println(i);
            }

        }
    }

    public static void imprimirImpares(int numero, int numero2) {

        for (int i = numero; i <= numero2; i++) {

            if (i % 2 != 0){
                System.out.println(i);
            }

        }
    }
}
