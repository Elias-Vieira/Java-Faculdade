package aula01_funcoes_e_procedimentos;

/*Escreva uma função que retorne o valor absoluto de um número passado como parâmetro.*/

public class Aula01Atv13 {
    public static int retornaAbsoluto(int numero) {
        return (numero < 0) ? -numero : numero;
    }

    public static void main(String[] args) {
        int negativo = -12;
        int positivo = 7;
        System.out.printf("Valor absoluto de %d = %d%n", negativo, retornaAbsoluto(negativo));
        System.out.printf("Valor absoluto de %d = %d%n", positivo, retornaAbsoluto(positivo));
    }
}
