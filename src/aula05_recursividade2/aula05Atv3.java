package aula05_recursividade2;

/*Escreva um método que calcule e retorne o N-ésimo número da sequência de Tribonacci,
que é dada pela seguinte função: f(n) = f(n-1)+f(n-2)+f(n-3), sendo os 3 primeiros número
da sequência: 0, 0, 1
*/

public class aula05Atv3 {

    public static void main(String[] args) {
        System.out.println(tribonacci(50));

    }

    public static int tribonacci(int numero){
        if (numero == 1) {return 0;}
        if (numero == 2) {return 0;}
        if (numero == 3) {return 1;}


        return tribonacci(numero - 1) + tribonacci(numero - 2) + tribonacci(numero - 3);
    }
}
