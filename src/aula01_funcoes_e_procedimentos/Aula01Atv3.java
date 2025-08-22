package aula01_funcoes_e_procedimentos;

/*Escreva um procedimento que mostre na tela toda a tabuada do 5. Exemplo:

5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
…
5 x 10 = 50

*/

public class Aula01Atv3 {
    public static void main(String[] args) {

        imprimirNumeros();


    }

    public static void imprimirNumeros() {

        for (int i = 0; i <= 10; i++) {

            System.out.printf("%d * %d = %d\n", 5, i , i * 5);

        }
    }
}
