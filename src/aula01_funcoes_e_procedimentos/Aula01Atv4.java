package aula01_funcoes_e_procedimentos;

/*Criar um procedimento que deve receber um valor inteiro positivo como parâmetro
e exibir se o valor informado pelo usuário é par ou ímpar.*/

public class Aula01Atv4 {
    public static void main(String[] args) {

        parOuImpar(5);

    }

    public static void parOuImpar(int numero) {

        if (numero % 2 == 0){

            System.out.println("Par");
        } else {

            System.out.println("Impar");
        }


    }
}