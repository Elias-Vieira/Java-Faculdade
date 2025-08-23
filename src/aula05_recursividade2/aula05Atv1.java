package aula05_recursividade2;

/*Verifique a função abaixo:

 public class Exercicio {

    public int X(int a) {
        if ( a <= 0 )
            return 0;

        return a + X(a-1);
    }

    public static void main(String[] arg){
        int result = X(8);
    }
}

Responda:
O que esta função faz?

RESPOSTA: A função faz a soma de todos os elementos de 1 a 8

fazendo o teste de mesa descobrimos o valor do retorno que e igual a 36

8 + x(7) = 36
7 + x(6) = 28
6 + x(5) = 21
5 + x(4) = 15
4 + x(3) = 10
3 + x(2) = 6
2 + x(1) = 3
1 + x(0) = 1
retorno = 0

Escreva uma função não recursiva que resolve o mesmo problema.

 */

public class aula05Atv1 {

    public static void main(String[] args) {

        System.out.println(somarNumeros(8));

    }

    public static int somarNumeros(int numero){
        int aux = 0;
        for (int i = 1; i <= numero; i++){
            aux += i;
        }

        return aux;
    }
}
