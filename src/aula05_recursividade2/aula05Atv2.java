package aula05_recursividade2;

/*Escreva um programa que solicite ao usuário um número inteiro positivo N qualquer.
Esse programa deverá realizar a soma da inversão de todos os números de 1 até N.
 Utilize o seguinte cálculo:  1 + 1/2 + 1/3 + 1/4 + ... + 1/n
 */

import java.util.Scanner;

public class aula05Atv2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero inteiro positivo: ");
        int recebeNumero = ler.nextInt();

        System.out.println(somaDaInversao(recebeNumero));
    }

    public static double somaDaInversao(int numero){
        if (numero == 0){
            return 0;
        } else {
            return (1.0/numero) + somaDaInversao(numero - 1);
        }
    }
}
