package aula04_recursividade;
import java.util.Scanner;

/*Criar uma função recursiva que calcule o n-ésimo número da sequência de Fibonacci.
Sendo a sequência de fibonacci, o resultado da soma do elemento anterior e do atual resulta
no valor do próximo elemento da sequência. A sequência inicia com os valores
 0 e 1(desconsiderar o inicio ‘0’).
 */
public class Aula04Atv4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = ler.nextInt();

        System.out.printf("O numero da posição %d eh: %d ", numero, fibonacci(numero));
    }

    public static int fibonacci(int numero){
        if (numero == 0) {return 1;}
        if (numero == 1){return 1;}

        return fibonacci(numero - 1) + fibonacci(numero - 2);
    }

}
