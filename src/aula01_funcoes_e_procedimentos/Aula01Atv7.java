package aula01_funcoes_e_procedimentos;

/*Escreva uma função que retorne o quadrado de um número inteiro qualquer Exemplo:

5 = 25
7 = 49

*/

public class Aula01Atv7 {

    public static void main(String[] args) {
        int numero = 5;
        System.out.printf("Quadrado de %d = %d%n", numero, aoQuadrado(numero));
    }

    public static int aoQuadrado(int numero) {
        return numero * numero;
    }
}