package aula01_funcoes_e_procedimentos;

/*Escreva um procedimento que imprima todos os números pares de 0 a 100.*/

public class Aula01Atv2 {
    public static void main(String[] args) {

        imprimirNumeros();


    }

    public static void imprimirNumeros() {

        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0){

                System.out.println(i);
            }

        }
    }
}
