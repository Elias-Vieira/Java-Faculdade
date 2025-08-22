package aula01_funcoes_e_procedimentos;

/*Escreva uma função que verifique se um número passado como parâmetro é par ou ímpar.*/

public class Aula01Atv12 {
    public static String identificarParidade(int numero) {
        if (numero % 2 == 0) {
            return numero + " é par";
        } else {
            return numero + " é ímpar";
        }
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 7;
        System.out.printf("%s%n", identificarParidade(n1));
        System.out.printf("%s%n", identificarParidade(n2));
    }
}
