package aula04_recursividade;

/*Criar uma função recursiva para calcular a potência de um número. O usuário deverá informar os
valores da base e do expoente. Exemplo:
Base: 3, expoente: 2    =>    3²    =>    9
	Base: 2, expoente: 3    =>    2³    =>    8
*/

import java.util.Scanner;

public class Aula04Atv3 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = ler.nextInt();

        System.out.print("\nDigite o expoente: ");
        int expoente = ler.nextInt();

        System.out.println(calcularPotencia(base, expoente));

    }

    public static int calcularPotencia(int base, int expoente){
        if (expoente == 0){
            return 1;
        }

        return base * calcularPotencia(base, expoente - 1);

    }

}
