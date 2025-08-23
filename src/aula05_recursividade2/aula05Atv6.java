package aula05_recursividade2;

/* Dado o código abaixo, assinale a alternativa correta:

public class P2 {
    public static void main(String[] args) {
        d(?);
    }

    public static int f(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * f(n - 1);
        }
    }

    public static void d(int n) {
        for (int c = 0; c <= n; c++) {
            System.out.printf("%d! = %d\n", c, f(c));
        }
    }
}

Dentre as opções abaixo, qual apresenta o valor da variável "c" quando d(c) = 24?

a) 8;
b) 7;
c) 6;
d) 5;
e) 4;

RESPOSTA: a função f() e uma função que retorna o fatorial e a função d() e uma função
que imprime, logo para ter uma saida 24 precisa se de um numero cujo o fatorial dele e 24
 que no caso o 4, logo a alternativa e a "E".

*/

public class aula05Atv6 {

    public static void main(String[] args) {
        System.out.println("A alternativa correta eh a E");
    }
}
