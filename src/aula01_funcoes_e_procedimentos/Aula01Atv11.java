package aula01_funcoes_e_procedimentos;

/*Escreva uma função que retorne o dobro de um número passado como parâmetro.*/

public class Aula01Atv11 {
    public static int calculaDobro(int numero) {
        return numero * 2;
    }

    public static void main(String[] args) {
        int valor1 = 8;
        int valor2 = 15;
        System.out.printf("Dobro de %d = %d%n", valor1, calculaDobro(valor1));
        System.out.printf("Dobro de %d = %d%n", valor2, calculaDobro(valor2));
    }
}
