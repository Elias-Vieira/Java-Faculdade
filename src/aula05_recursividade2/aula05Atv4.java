package aula05_recursividade2;

/*Escreva um método recursivo que calcule o N-ésimo número da sequência de Pell,
 que é dada pela seguinte fórmula: P(n) = 2P(n-1)+P(n-2), sendo os primeiros números
 da sequência 0 e 1, respectivamente.
*/

public class aula05Atv4 {

    public static void main(String[] args) {

        System.out.println(pell(6));

    }

    public static int pell(int numero){
        if (numero == 1){return 0;}
        if (numero == 2){return 1;}

         return 2 * pell(numero - 1) + pell(numero - 2);

    }
}
