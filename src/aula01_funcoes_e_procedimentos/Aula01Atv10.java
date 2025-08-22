package aula01_funcoes_e_procedimentos;

/*Criar uma função que receberá um valor inteiro positivo. A função deverá calcular o número
fatorial dele ou 0 caso o valor informado for negativo ou zero.*/

public class Aula01Atv10 {
    public static int calculaFatorial(int numero) {
        if (numero <= 0) {
            return 0;
        }
        int fat = 1;
        for (int i = 1; i <= numero; i++) {
            fat *= i;
        }
        return fat;
    }

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 0;
        System.out.printf("Fatorial de %d = %d%n", n1, calculaFatorial(n1));
        System.out.printf("Fatorial de %d = %d%n", n2, calculaFatorial(n2));
    }
}