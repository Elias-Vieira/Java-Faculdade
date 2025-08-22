package aula04_recursividade;

/*Criar uma função recursiva que o usuário informe um valor inteiro e realize a soma de todos os
números naturais pares de 1 até o valor informado pelo usuário. Exemplo:
	Número: 9
	Resultado: 2+4+6+8 = 20
*/

public class Aula04Atv1 {
    public static void main(String[] args) {

        System.out.println(somarPares(10));

    }

    public static int somarPares(int numero) {

        if (numero % 2 == 0) {
            if (numero == 0) {
                return 0;
            } else {

                return numero + somarPares(numero - 2);

            }
        }
        return somarPares(numero - 1);
    }
}