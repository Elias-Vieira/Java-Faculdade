package aula04_recursividade;

/*Criar uma função recursiva que receba um array unidimensional de tamanho N
 de inteiros e retorne a soma de todos os seus elementos. Exemplo:
Array: [4, 8, 1,7, 2, 0]
Soma: 22
*/

public class Aula04Atv2 {

    static int indice = 0;

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 8};

        System.out.println(somaDosElementos(array));

    }

    public static int somaDosElementos(int[] array) {

        if (indice == array.length) {
            return 0;
        }
        return array[indice++] + somaDosElementos(array);

    }
}
