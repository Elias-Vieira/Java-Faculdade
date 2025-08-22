package aula01_funcoes_e_procedimentos;

/*Escreva uma função que retornará true caso o valor seja múltiplo de 3 ou false, caso contrário*/

public class Aula01Atv9 {

    public static void main(String[] args) {
        int x = 9;
        System.out.printf("%d é múltiplo de 3? %b%n", x, verificaMultiplo3(x));
    }

    public static boolean verificaMultiplo3(int valor) {
        return valor % 3 == 0;
    }
}
