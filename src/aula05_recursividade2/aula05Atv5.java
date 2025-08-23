package aula05_recursividade2;

/*Escreva um método recursivo que realize a conversão de um número inteiro positivo para binário.*/

public class aula05Atv5 {

    public static void main(String[] args) {

        System.out.println(retornarBinario(19));

    }

    public static String retornarBinario(int numero){

        if (numero == 0){return "0";}
        if (numero == 1){return "1";}

            return retornarBinario(numero / 2) + ( numero % 2);
        }

    }
